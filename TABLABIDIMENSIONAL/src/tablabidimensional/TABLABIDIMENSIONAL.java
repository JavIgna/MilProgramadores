package tablabidimensional;

public class TABLABIDIMENSIONAL {

    public static void main(String[] args) {

        int tam = 5;

        int[][] matrix = new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matrix[i][j] = i + j;
            }
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
