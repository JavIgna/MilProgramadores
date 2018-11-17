package rellenar_entre;

import java.util.Scanner;

public class RELLENAR_ENTRE {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Ingresa n° 1:");
        int a = get.nextInt();
        System.out.println("Ingresa n° 2:");
        int b = get.nextInt();
        rellenar(a, b);
    }

    public static int in(int var1, int var2) {
        int resultado;
        if (var1 < var2) {
            return var1;
        } else {
            return var2;
        }
    }

    public static int ter(int var1, int var2) {
        int resultado;
        if (var1 > var2) {
            return var1;
        } else {
            return var2;
        }
    }

    public static void rellenar(int inicio, int fin) {
        for (int i = in(inicio, fin); i <= ter(inicio, fin); i++) {
            System.out.print(i + (i < ter(inicio, fin) ? ", " : "."));
        }
        System.out.println("");
    }
}
