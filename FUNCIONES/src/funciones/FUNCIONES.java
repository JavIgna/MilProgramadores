package funciones;

import java.util.Scanner;

public class FUNCIONES {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Ingresa un valor:");
        int a = get.nextInt();
        System.out.println("Ingresa otro valor:");
        int b = get.nextInt();
        System.out.println("Ingresa otro valor:");
        int c = get.nextInt();
        System.out.println("El maximo es: " + Comparar(a, b, c));
    }

    public static int Comparar(int var1, int var2, int var3) {
        int resultado;
        if (var1 > var2) {
            resultado = var1;
        } else if (var1 < var3) {
            resultado = var3;
        } else {
            resultado = var2;
        }
        return resultado;
    }
}
