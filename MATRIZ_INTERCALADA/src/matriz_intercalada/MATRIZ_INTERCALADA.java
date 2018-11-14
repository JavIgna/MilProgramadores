package matriz_intercalada;

import java.util.Scanner;

public class MATRIZ_INTERCALADA {
    
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        
        int fil, col, cont;
        String str = " ";
        
        do {
            System.out.println("Ingresa numero de filas: ");
            fil = get.nextInt();
        } while (!(fil % 2 == 1));
        
        do {
            System.out.println("Ingresa numero de columnas: ");
            col = get.nextInt();
        } while (!(col % 2 == 1));
        
        System.out.println("Ingresa numero a mostrar: ");
        String mult = get.next();
        
        String[][] matrix = new String[fil][col];
        cont = 0;
        
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                cont++;
                if (cont % 2 == 1) {
                    matrix[i][j] = mult;
                } else {
                    matrix[i][j] = str;
                }
                
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
