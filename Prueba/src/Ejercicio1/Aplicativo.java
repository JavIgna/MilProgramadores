/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author JavieR
 */
public class Aplicativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CuentaAhorro cuenta1 = new CuentaAhorro(555555555, "Peter Peterson", 100, 0.03);

        int op;

        do {
            op = menu();

            switch (op) {
                case 1:
                    realizarDeposito(cuenta1);
                    break;
                case 2:
                    realizarGiro(cuenta1);
                    break;
                case 3:
                    consultaSaldo(cuenta1);
                    break;
                case 4:
                    saberInteres(cuenta1);
                    break;
                case 5:
                    convertirUSD(cuenta1);
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
            }

        } while (op != 6);

    }

    private static int menu() {
        Scanner get = new Scanner(System.in);
        int op = -1;

        System.out.println("MENÚ");
        System.out.println("1.- Realizar dépositos.");
        System.out.println("2.- Realizar giro.");
        System.out.println("3.- Saldo.");
        System.out.println("4.- Interes ganado");
        System.out.println("5.- Convertir CLP a USD.");
        System.out.println("6.- Salir");

        do {
            System.out.println("Ingresa una opción válida");
            op = get.nextInt();
        } while ((op < 1) || (op > 6));

        return op;

    }

    private static void realizarDeposito(CuentaAhorro cuenta) {
        Scanner get = new Scanner(System.in);

        System.out.println("Has seleccionado realizar un déposito:");
        System.out.println("Tu saldo actual es: " + cuenta.getSaldo());
        System.out.println("Ingresa el monto a depositar: ");
        double deposito = get.nextDouble();
        deposito += cuenta.getSaldo();
        cuenta.setSaldo(deposito);
        System.out.println("Tu nuevo saldo es: " + cuenta.getSaldo());
    }

    private static void realizarGiro(CuentaAhorro cuenta) {
        Scanner get = new Scanner(System.in);

        System.out.println("Has seleccionado realizar un giro:");
        System.out.println("Tu saldo actual es: " + cuenta.getSaldo());
        System.out.println("Ingresa el monto a depositar: ");
        double giro = get.nextDouble();
        if (cuenta.getSaldo() < giro) {
            System.out.println("Su saldo es insuficiente para realizar el giro");
        } else {
            giro = cuenta.getSaldo() - giro;
            cuenta.setSaldo(giro);
            System.out.println("Tu nuevo saldo es: " + cuenta.getSaldo());
        }
    }

    private static void consultaSaldo(CuentaAhorro cuenta) {
        System.out.println("Tu saldo es: " + cuenta.getSaldo());
    }

    private static void saberInteres(CuentaAhorro cuenta) {
        System.out.println("Has seleccionado interes ganado");
        double interes = cuenta.getInteres();
        double saldo = cuenta.getSaldo();
        double ganancia = (interes * saldo);
        System.out.println("Los intereses generados con tu actual saldo: " + saldo + "\nSon: " + ganancia);
        ganancia = ganancia + saldo;
        System.out.println("Lo que da un total anual de " + ganancia);
    }

    private static void convertirUSD(CuentaAhorro cuenta) {
        double saldo = cuenta.getSaldo();
        System.out.println("Tu saldo: " + saldo);
        System.out.println("Será convertido a dolares.");
        System.out.println("Tu saldo equivale a: " + (saldo / 698) + " dólares");
    }

}
