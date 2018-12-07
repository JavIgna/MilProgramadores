/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telollevo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guillermofuentesquijada
 */
public class TeLoLlevo {

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
            }
        } while (op != 4);

    }

    private static int menu() {
        int op = 0;
        System.out.println("....::::: MENU :::::....");
        System.out.println("1. Las encomiendas que se han enviado de la ciudad X a la ciudad Y");
        System.out.println("2. Encomiendas enviadas en un periodo de tiempo por un cliente X");
        System.out.println("3. Las encomiendas que el cliente A ha enviado a un cliente B");
        System.out.println("4. Salir");
        System.out.println();
        do {
            System.out.println("Ingrese una opción válida (entre 1 y 4)");
            op = tcld.nextInt();
            System.out.println();
        } while (op <= 0 || op >= 5);

        return op;
    }

    private static void opcion1() {
        Scanner get = new Scanner(System.in);
        System.out.println("Ingresa la ciudad de origen: \n"
                + "Chillan\n"
                + "San Carlos\n"
                + "Bulnes\n"
                + "Pinto");
        String ciudadOrigen = get.next();

        ArrayList<Encomienda> encomiendasAux = new ArrayList<>();

        for (Encomienda encomienda : encomiendas) {
            if (encomienda.getOrigen().getCiudad().getNombre().equals(ciudadOrigen)) {
                encomiendasAux.add(encomienda);
            }
        }

        System.out.println("Ingresa la ciudad de destino: \n"
                + "Chillan\n"
                + "San Carlos\n"
                + "Bulnes\n"
                + "Pinto");
        String ciudadDestino = get.next();

        ArrayList<Encomienda> resulBusqEncomienda = new ArrayList<>();

        for (Encomienda encomienda : encomiendasAux) {
            if (encomienda.getDestino().getCiudad().getNombre().equals(ciudadDestino)) {
                resulBusqEncomienda.add(encomienda);
            }
        }

        System.out.println(resulBusqEncomienda.toString());

    }

    private static void opcion2() {

    }

    private static void opcion3() {

    }

    private static void opcion4() {
        System.out.println("Adios, vuelva pronto!");
        tcld.close();
        System.exit(0);
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
