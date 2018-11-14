package matriz_multiplo;

import java.util.Scanner;

public class MATRIZ_MULTIPLO {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		
		
		System.out.println("Ingresa numero de filas: ");
		int fil = get.nextInt();
		System.out.println("Ingresa numero de columnas: ");
		int col = get.nextInt();
		System.out.println("Ingresa numero a multiplicar: ");
		int mult = get.nextInt();
		int cont = 0;
		
		int[][] matrix = new int[fil][col];
		
		for (int i = 0; i < fil; i++) {
			for (int j = 0; j < col; j++) {
				cont++;
				matrix[i][j] = cont * mult;
			}
		}	
		
		for (int i = 0; i < fil; i++) {
			for (int j = 0; j < col; j++) {
					System.out.print("[" + matrix[i][j] + "]");
			}
			System.out.println("");
		}	
	}
}
