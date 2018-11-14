/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparar;

import java.util.Scanner;

/**
 *
 * @author JavieR
 */
public class COMPARAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un número entero:");
        int var1 = leer.nextInt();
        System.out.println("Escribe otro número entero para compararlos:");
        int var2 = leer.nextInt();

        if (var1 == var2) {
            System.out.println("Ambos números son iguales.");
        } else {
            System.out.println("Los números son diferentes.");
        }

    }

}
