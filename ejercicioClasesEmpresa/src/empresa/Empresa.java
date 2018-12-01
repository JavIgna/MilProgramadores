package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {

    private static ArrayList<Empleado> empleados = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {

        //Crear menú
        int op = 3;

        do {
            op = menu();
            switch (op) {
                case 1:
                    mostrarEmpleados();
                    break;
                case 2:
                    mostrarClientes();
                    break;
                case 3:
                    addEmpleado();
                    break;
                case 4:
                    addCliente();
                    break;
                case 5:
                    addDirectivo();
                    break;
                case 6:
                    System.out.println("Adiós <3");
            }
        } while (op
                != 6);
    }

    public static int menu() {
        int op = -1;
        Scanner get = new Scanner(System.in);

        System.out.println("...:::MENÚ:::...");
        System.out.println("1. Mostrar Empleados");
        System.out.println("2. Mostrar Clientes");
        System.out.println("3. Agregar Empleados");
        System.out.println("4. Agregar Clientes");
        System.out.println("5. Agregar Directivo");
        System.out.println("6. Salir");

        do {
            System.out.println("Ingrese una opción (válida)");
            op = get.nextInt();
        } while (op < 1 || op > 6);
        return op;
    }

    public static void mostrarEmpleados() {
        //size>0
        if (empleados.size() > 0) {
            //Mostrar
            for (int i = 0; i < empleados.size(); i++) {
                System.out.println(empleados.toString());
            }
        } else {
            //Mensaje
            System.out.println("No hay Empleados en nuestros registros");
        }
    }

    public static void mostrarClientes() {
        //size>0
        if (clientes.size() > 0) {
            //Mostrar
            for (int i = 0; i < clientes.size(); i++) {
                System.out.println(clientes.toString());
            }
        } else {
            //Mensaje
            System.out.println("No hay Clientes en nuestros registros");
        }
    }

    public static void addEmpleado() {
        Scanner get = new Scanner(System.in);
        System.out.println("Ha seleccionado la opción Agregar Empleado");
        int sueldo;
        String nombre;
        int edad;
        System.out.println("Ingrese el nombre del Empleado");
        nombre = get.next();
        System.out.println("Ingrese la edad del Empleado");
        edad = get.nextInt();
        System.out.println("Ingrese el sueldo del Empleado");
        sueldo = get.nextInt();
        Empleado empleado = new Empleado(sueldo, nombre, edad);
        empleados.add(empleado);
        System.out.println("Empleado agregado exitosamente... \n");
    }

    public static void addCliente() {
        Scanner get = new Scanner(System.in);
        System.out.println("Ha seleccionado la opción Agregar Cliente");
        int numContacto;
        String nombre;
        int edad;
        System.out.println("Ingrese el nombre del Cliente");
        nombre = get.next();
        System.out.println("Ingrese la edad del Cliente");
        edad = get.nextInt();
        System.out.println("Ingrese el numero de contacto del Empleado");
        numContacto = get.nextInt();
        Cliente cliente = new Cliente(numContacto, nombre, edad);
        clientes.add(cliente);
        System.out.println("Cliente agregado exitosamente... \n");
    }

    private static void addDirectivo() {
        Scanner get = new Scanner(System.in);
        System.out.println("Ha seleccionado la opción Agregar Directivo");
        char categoria;
        int sueldo;
        String nombre;
        int edad;
        System.out.println("Ingrese el nombre del Directivo");
        nombre = get.next();
        System.out.println("Ingrese la edad del Directivo");
        edad = get.nextInt();
        System.out.println("Ingrese el sueldo del Directivo");
        sueldo = get.nextInt();
        System.out.println("Ingrese la categiría del Directivo");
        categoria = get.next().charAt(0);
        Directivo directivo = new Directivo(categoria, sueldo, nombre, edad);
        empleados.add(directivo);
        System.out.println("Empleado agregado exitosamente... \n");
    }
}
