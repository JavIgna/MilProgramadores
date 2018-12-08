/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yolollevo;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guillermofuentesquijada
 */
public class YoLoLlevo {

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Ciudad> ciudades = new ArrayList<>();
    static ArrayList<Encomienda> encomiendas = new ArrayList<>();
    static Scanner tcld = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cargarDatos();
        int op = 0;
        do {
            op = menu();

            switch (op) {
                case 1:
                    opcion1();
                    break;
                case 2:
                    opcion2();
                    break;
                case 3:
                    opcion3();
                    break;
                case 4:
                    opcion4();
                    break;
                case 5:
                    opcion5();
                    break;
                case 6:
                    opcion6();
                    break;
                case 7:
                    opcion7();
                    break;
            }
        } while (op != 7);
    }

    private static int menu() {
        int op = 0;
        System.out.println("....::::: MENU :::::....");
        System.out.println("1. Las encomiendas que se han enviado de la ciudad X a la ciudad Y");
        System.out.println("2. Encomiendas enviadas en un periodo de tiempo por un cliente X");
        System.out.println("3. Las encomiendas que el cliente A ha enviado a un cliente B");
        System.out.println("4. Las encomiendas que tienen más de un paquete");
        System.out.println("5. Oficinas de una ciudad X");
        System.out.println("6. Administrador y dirección de una oficina X");
        System.out.println("7. Salir");
        System.out.println();
        do {
            System.out.println("Ingrese una opción válida (entre 1 y 7)");
            op = tcld.nextInt();
            System.out.println();
        } while (op <= 0 && op > 7);

        return op;
    }

    private static void opcion1() {
        System.out.println("Seleccione la ciudad de origen:");
        Ciudad origen = mostrarSeleccionarCiudad();
        System.out.println();
        System.out.println("Seleccione la ciudad de destino:");
        Ciudad destino = mostrarSeleccionarCiudad();
        System.out.println();
        if (hayEncomiendasEnCiudades(origen, destino)) {
            mostrarEncomiendasEnCiudades(origen, destino);
        } else {
            System.out.println("No hay encomiendas asociadas a las ciudades elegidas");
        }
        System.out.println();
    }

    private static void opcion2() {
        System.out.println("Seleccione el cliente para realizar la búsqueda: ");
        Cliente clienteBuscar = mostrarSeleccionarCliente();
        System.out.println("Ingrese la fecha de inicio de la búsqueda (formato dia/mes/anio, ejemplo 22/12/2018): ");
        String fechaIni = tcld.next();
        LocalDate fechaInicio = crearFecha(fechaIni);
        while (fechaInicio == null) {
            System.out.println("Ingrese la fecha de inicio de la búsqueda (formato dia/mes/anio, ejemplo 22/12/2018) (VÁLIDA): ");
            fechaIni = tcld.next();
            fechaInicio = crearFecha(fechaIni);
        }
        System.out.println();
        System.out.println("Ingrese la fecha de fin de la búsqueda (formato dia/mes/anio, ejemplo 22/12/2018): ");
        String fechaFin = tcld.next();
        LocalDate fechaFinn = crearFecha(fechaFin);
        while (fechaFinn == null) {
            System.out.println("Ingrese la fecha de fin de la búsqueda (formato dia/mes/anio, ejemplo 22/12/2018) (VÁLIDA): ");
            fechaFin = tcld.next();
            fechaFinn = crearFecha(fechaFin);
        }
        System.out.println();
        boolean hay = hayEncomiendasEnPeriodoTiempo(fechaInicio, fechaFinn, clienteBuscar);
        if (hay) {
            mostrarEncomiendasEnPeriodoTiempo(fechaInicio, fechaFinn, clienteBuscar);
        } else {
            System.out.println("No hay encomiendas en el periodo indicado");
        }
        System.out.println();
    }

    private static void opcion3() {
        System.out.println("Indique el Cliente remitente");
        Cliente remitente = mostrarSeleccionarCliente();
        System.out.println("Indique el Cliente destinatario");
        Cliente detinatario = mostrarSeleccionarCliente();
        boolean hay = tienenEncomiendas(remitente, detinatario);
        if (hay) {
            mostrarEncomiendasEntreClientes(remitente, detinatario);
        } else {
            System.out.println("No hay encomiendas para mostrar");
        }
        System.out.println();
    }

    private static void opcion4() {
        for (Encomienda encomienda : encomiendas) {
            if (encomienda.cantPaquetes() > 1) {
                System.out.println("*********************************");
                System.out.println("Identificador: " + encomienda.getIdentificador());
                System.out.println("Cliente Remitente: " + encomienda.getRemitente().getNombre());
                System.out.println("Cliente Destinatario: " + encomienda.getDestinatario().getNombre());
                System.out.println("Oficina Origen: " + encomienda.getOrigen().getDireccion() + " " + encomienda.getOrigen().getCiudad().getNombre());
                System.out.println("Oficina Destino: " + encomienda.getDestino().getDireccion() + " " + encomienda.getDestino().getCiudad().getNombre());
                System.out.println("Paquete/s:");
                Integer costoTotal = 0;
                for (int i = 0; i < encomienda.cantPaquetes(); i++) {
                    Paquete paquete = encomienda.obtenerPaquete(i);
                    System.out.println((i + 1) + ".- " + paquete);
                    costoTotal += paquete.getCosto();
                }
                System.out.println("Costo Total Envio: " + costoTotal);
                System.out.println("*********************************");
            }
        }
    }

    private static void opcion5() {
        Ciudad ciudad = mostrarSeleccionarCiudad();
        for (int i = 0; i < ciudad.cantOficinas(); i++) {
            System.out.println(ciudad.obtenerOficina(i).toString());
        }
    }

    private static void opcion6() {
        Ciudad ciudad = mostrarSeleccionarCiudad();
        Oficina ofAux = mostrarSeleccionarOficina(ciudad);
        System.out.println("Administrador: " + ofAux.getAdministrador() + "\n"
                + "Dirección: " + ofAux.getDireccion());
    }

    private static void opcion7() {
        System.out.println("Adios, vuelva pronto!");
        tcld.close();
        System.exit(0);
    }

    private static boolean tienenEncomiendas(Cliente remitente, Cliente destinatario) {
        boolean respuesta = false;
        for (Encomienda encomienda : encomiendas) {
            if (encomienda.getRemitente().equals(remitente) && encomienda.getDestinatario().equals(destinatario)) {
                respuesta = true;
                break;
            }
        }
        return respuesta;
    }

    private static void mostrarEncomiendasEntreClientes(Cliente remitente, Cliente destinatario) {
        for (Encomienda encomienda : encomiendas) {
            if (encomienda.getRemitente().equals(remitente) && encomienda.getDestinatario().equals(destinatario)) {
                System.out.println("*********************************");
                System.out.println("Identificador: " + encomienda.getIdentificador());
                System.out.println("Oficina Origen: " + encomienda.getOrigen().getDireccion() + " " + encomienda.getOrigen().getCiudad().getNombre());
                System.out.println("Oficina Destino: " + encomienda.getDestino().getDireccion() + " " + encomienda.getDestino().getCiudad().getNombre());
                System.out.println("Paquete/s:");
                Integer costoTotal = 0;
                for (int i = 0; i < encomienda.cantPaquetes(); i++) {
                    Paquete paquete = encomienda.obtenerPaquete(i);
                    System.out.println((i + 1) + ".- " + paquete);
                    costoTotal += paquete.getCosto();
                }
                System.out.println("Costo Total Envio: " + costoTotal);
                System.out.println("*********************************");
            }
        }
    }

    private static LocalDate crearFecha(String fecha) {
        LocalDate respuesta = null;
        int dia = Integer.parseInt(fecha.split("/")[0]);
        int mes = Integer.parseInt(fecha.split("/")[1]);
        int anio = Integer.parseInt(fecha.split("/")[2]);
        try {
            respuesta = LocalDate.of(anio, mes, dia);
            return respuesta;
        } catch (Exception e) {
            return null;
        }
    }

    private static Cliente mostrarSeleccionarCliente() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ".- Nombre: " + clientes.get(i).getNombre() + ", RUT: " + clientes.get(i).getRut() + ", Direccion: " + clientes.get(i).getDireccion());
        }
        int op = 0;
        do {
            System.out.println("Ingrese el número del cliente: ");
            op = tcld.nextInt();
        } while (op <= 0 || op > clientes.size());

        return clientes.get(op - 1);
    }

    private static boolean hayEncomiendasEnPeriodoTiempo(LocalDate inicio, LocalDate fin, Cliente buscar) {
        boolean respuesta = false;
        for (Encomienda encomienda : encomiendas) {
            for (int i = 0; i < encomienda.cantPaquetes(); i++) {
                Paquete paquete = encomienda.obtenerPaquete(i);
                if (encomienda.getRemitente().equals(buscar) && (paquete.getFechaenvio().isEqual(inicio) || paquete.getFechaenvio().isAfter(inicio))
                        && (paquete.getFechaenvio().isEqual(fin) || paquete.getFechaenvio().isBefore(fin))) {
                    respuesta = true;
                    break;
                }
            }
            if (respuesta) {
                break;
            }
        }
        return respuesta;
    }

    private static boolean hayEncomiendasEnCiudades(Ciudad origen, Ciudad destino) {
        boolean respuesta = false;
        for (Encomienda encomienda : encomiendas) {
            if (encomienda.getOrigen().getCiudad().equals(origen) && encomienda.getDestino().getCiudad().equals(destino)) {
                respuesta = true;
                break;
            }
        }
        return respuesta;
    }

    private static void mostrarEncomiendasEnPeriodoTiempo(LocalDate inicio, LocalDate fin, Cliente buscar) {
        boolean es = false;
        for (Encomienda encomienda : encomiendas) {
            for (int i = 0; i < encomienda.cantPaquetes(); i++) {
                Paquete paquete = encomienda.obtenerPaquete(i);
                if (encomienda.getRemitente().equals(buscar) && (paquete.getFechaenvio().isEqual(inicio) || paquete.getFechaenvio().isAfter(inicio))
                        && (paquete.getFechaenvio().isEqual(fin) || paquete.getFechaenvio().isBefore(fin))) {
                    es = true;
                    break;
                }
            }
            if (es) {
                System.out.println("*********************************");
                System.out.println("Identificador: " + encomienda.getIdentificador());
                System.out.println("Cliente Remitente: " + encomienda.getRemitente().getNombre());
                System.out.println("Cliente Destinatario: " + encomienda.getDestinatario().getNombre());
                System.out.println("Paquete/s:");
                Integer costoTotal = 0;
                for (int i = 0; i < encomienda.cantPaquetes(); i++) {
                    Paquete paquete = encomienda.obtenerPaquete(i);
                    System.out.println((i + 1) + ".- " + paquete);
                    costoTotal += paquete.getCosto();
                }
                System.out.println("Costo Total Envio: " + costoTotal);
                System.out.println("*********************************");
                es = false;
            }
        }
    }

    private static void mostrarEncomiendasEnCiudades(Ciudad origen, Ciudad destino) {
        for (Encomienda encomienda : encomiendas) {
            if (encomienda.getOrigen().getCiudad().equals(origen) && encomienda.getDestino().getCiudad().equals(destino)) {
                System.out.println("*********************************");
                System.out.println("Identificador: " + encomienda.getIdentificador());
                System.out.println("Cliente Remitente: " + encomienda.getRemitente().getNombre());
                System.out.println("Cliente Destinatario: " + encomienda.getDestinatario().getNombre());
                System.out.println("Paquete/s:");
                Integer costoTotal = 0;
                for (int i = 0; i < encomienda.cantPaquetes(); i++) {
                    Paquete paquete = encomienda.obtenerPaquete(i);
                    System.out.println((i + 1) + ".- " + paquete);
                    costoTotal += paquete.getCosto();
                }
                System.out.println("Costo Total Envio: " + costoTotal);
                System.out.println("*********************************");
            }
        }
    }

    private static Ciudad mostrarSeleccionarCiudad() {
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println((i + 1) + ".- " + ciudades.get(i).getNombre() + ", Región Nro: " + ciudades.get(i).getNumero());
        }
        int op = 0;
        do {
            System.out.println("Ingrese el número de la ciudad a seleccionar: ");
            op = tcld.nextInt();
        } while (op <= 0 || op > ciudades.size());

        return ciudades.get(op - 1);
    }

    private static Oficina mostrarSeleccionarOficina(Ciudad ciudad) {
        Oficina oficina = null;
        for (int i = 0; i < ciudad.cantOficinas(); i++) {
            System.out.println((i + 1) + ".- Oficina: " + ciudad.obtenerOficina(i).getCodigo());
        }
        int op = 0;
        do {
            System.out.println("Ingrese el número de la oficina a seleccionar: ");
            op = tcld.nextInt();
        } while (op <= 0 || op > ciudad.cantOficinas());
        
        oficina = ciudad.obtenerOficina(op - 1);
        
        return oficina;
    }

    private static void cargarDatos() {
        Cliente cliente1 = new Cliente("11222333-K", "Pedro Perez", "El lago 568");
        Cliente cliente2 = new Cliente("11222444-K", "Pedro Cofre", "El monte 532");
        Cliente cliente3 = new Cliente("11555333-K", "Enrique Perez", "El cerro 900");
        Cliente cliente4 = new Cliente("11222666-K", "Pedro Fernandez", "La montaña 124");
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        Ciudad ciudad1 = new Ciudad("1A", "Chillan", 16);
        Ciudad ciudad2 = new Ciudad("4A", "San Carlos", 16);
        Ciudad ciudad3 = new Ciudad("5A", "Bulnes", 16);
        Ciudad ciudad4 = new Ciudad("8A", "Pinto", 16);

        Oficina oficina1 = new Oficina("X1", "Fernando", "El Roble 490");
        Oficina oficina2 = new Oficina("X2", "Hugo", "Arauco 700");

        oficina1.setCiudad(ciudad1);
        oficina2.setCiudad(ciudad1);
        ciudad1.agregarOficina(oficina1);
        ciudad1.agregarOficina(oficina2);

        Oficina oficina3 = new Oficina("X3", "Francisco", "Enrique Ulloa 400");

        oficina3.setCiudad(ciudad2);
        ciudad2.agregarOficina(oficina3);

        Oficina oficina4 = new Oficina("X4", "Rodrigo", "Juan Martinez 300");

        oficina4.setCiudad(ciudad3);
        ciudad3.agregarOficina(oficina4);

        Oficina oficina5 = new Oficina("X5", "Raul", "Sotomayor 500");

        oficina5.setCiudad(ciudad4);
        ciudad4.agregarOficina(oficina5);

        ciudades.add(ciudad1);
        ciudades.add(ciudad2);
        ciudades.add(ciudad3);
        ciudades.add(ciudad4);

        Paquete paquete1 = new Paquete("001", "Computador", LocalDate.now().minusDays(40), 33.4, 5000);
        Paquete paquete2 = new Paquete("002", "Radio", LocalDate.now().minusDays(40), 10.0, 2400);
        Paquete paquete3 = new Paquete("003", "Monitor", LocalDate.now().minusDays(40), 5.5, 3400);
        Paquete paquete4 = new Paquete("004", "Notebook", LocalDate.now().minusDays(15), 3.4, 5600);
        Paquete paquete5 = new Paquete("005", "Ropa", LocalDate.now().minusDays(10), 100.2, 2000);
        Paquete paquete6 = new Paquete("006", "Refrigerador", LocalDate.now().minusDays(5), 80.6, 10000);
        Paquete paquete7 = new Paquete("007", "Computador", LocalDate.now().minusDays(2), 15.2, 7000);

        Encomienda encomienda1 = new Encomienda("001", cliente1, cliente2, oficina1, oficina3);
        Encomienda encomienda2 = new Encomienda("002", cliente1, cliente3, oficina1, oficina5);
        Encomienda encomienda3 = new Encomienda("003", cliente2, cliente4, oficina2, oficina4);
        Encomienda encomienda4 = new Encomienda("004", cliente3, cliente1, oficina5, oficina1);
        Encomienda encomienda5 = new Encomienda("005", cliente4, cliente2, oficina4, oficina2);

        paquete1.setEncomienda(encomienda1);
        paquete2.setEncomienda(encomienda1);
        paquete3.setEncomienda(encomienda1);
        encomienda1.agregarPaquete(paquete1);
        encomienda1.agregarPaquete(paquete2);
        encomienda1.agregarPaquete(paquete3);

        paquete4.setEncomienda(encomienda2);
        encomienda2.agregarPaquete(paquete4);

        paquete5.setEncomienda(encomienda3);
        encomienda3.agregarPaquete(paquete5);

        paquete6.setEncomienda(encomienda4);
        encomienda4.agregarPaquete(paquete6);

        paquete7.setEncomienda(encomienda5);
        encomienda5.agregarPaquete(paquete7);

        encomiendas.add(encomienda1);
        encomiendas.add(encomienda2);
        encomiendas.add(encomienda3);
        encomiendas.add(encomienda4);
        encomiendas.add(encomienda5);

    }
}
