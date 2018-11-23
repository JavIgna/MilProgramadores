package empresa;

import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        //Crear menú
        int op = 3;
        do {
            op = menu();
            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
            }
        } while (op != 3);
    }

    public static int menu() {
        int op = -1;
        Scanner get = new Scanner(System.in);

        System.out.println("...:::MENÚ:::...");
        System.out.println("1. Mostrar Empleados");
        System.out.println("2. Mostrar Clientes");
        System.out.println("3. Salir");
        
        do {
            System.out.println("Ingrese una opción (válida)");
            op = get.nextInt();
        } while (op < 1 || op > 3);
        return op;
    }

    public static void mostrarEmpleado() {

    }

    public static void mostrarCliente() {

    }
}
