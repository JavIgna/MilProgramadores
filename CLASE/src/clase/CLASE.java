/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import java.util.Scanner;

/**
 *
 * @author andressencediurno
 */
public class CLASE {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here

		Scanner leer = new Scanner(System.in);

		int cont = 0;
		while (cont < 10) {
			cont++;
			System.out.println("prueba: " + cont);
		}

		int[][] matrix = new int[3][3];

		//matrix [1][2] = 4;
		int contador = 1;

		/*		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Ingresa el valor deseado en: " +(i +1) +"," +(j+1));
				matrix[i][j] = leer.nextInt();
			}
			
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = contador;
				contador = contador + 2;
			}

		}*/
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				while (!esPrimo(contador)) {
					contador++;
				}
				matrix[i][j] = contador;
				contador++;
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("[" + matrix[i][j] + "]");
			}
			System.out.println("");
		}
	}

	public static boolean esPrimo(int numero) {
		int contador = 0;

		for (int i = 1; i <= numero; i++) {
			if ((numero % i) == 0) {
				contador++;
			}
		}
		return contador <= 2;
	}
}
