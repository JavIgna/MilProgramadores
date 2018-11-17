package trasponer;

import java.util.Scanner;

public class TRASPONER {

    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);
        System.out.println("Ingresa el numero de filas: ");
        int n = pedir.nextInt();
        System.out.println("Ingresa el numero de columnas: ");
        int m = pedir.nextInt();

        int[][] matriz_1 = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Ingresa un valor: ");
                matriz_1[i][j] = pedir.nextInt();
            }
        }
        
        System.out.println("Matriz Original");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz_1[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("");
        
        int[][] matriz_2 = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz_2[i][j] = matriz_1[j][i];
            }
        }

        System.out.println("Matriz Traspuesta");
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz_2[i][j] + "]");
            }
            System.out.println("");
        }

    }

}
