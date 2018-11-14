package matriz_diagonal;

import java.util.Scanner;

public class MATRIZ_DIAGONAL {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        int tam, cont;
        String str = " ";

        do {
            System.out.println("Ingresa tamaño de la matriz: ");
            tam = get.nextInt();
        } while (!(tam % 2 == 1));

        System.out.println("¿Qué deseas mostrar?");
        String mult = get.next();

        String[][] matrix = new String[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matrix[i][j] = str;
            }
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == j) {
                    matrix[i][j] = mult;
                }
            }
        }
        
        int jota = tam -1;
        
        for (int i = 0; i < tam; i++) {
            matrix[i][jota] = mult;
            jota--;
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
