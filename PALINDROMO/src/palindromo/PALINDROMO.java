package palindromo;

import java.util.Scanner;

public class PALINDROMO {

    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);
        System.out.println("Ingresa el palindromo a comprobar:");
        String palabra = pedir.next();

        int in = 0;
        int fin = palabra.length() - 1;
        boolean parar = false;
        while (fin > in && !parar) {
            if ((palabra.charAt(in)) != (palabra.charAt(fin))) {
                parar = true;
            }
            in++;
            fin--;
        }
        if ((in == fin || fin == in) && !parar) {
            System.out.println("Es un palindromo.");
        } else {
            System.out.println("No es un palindromo.");
        }
    }
}
