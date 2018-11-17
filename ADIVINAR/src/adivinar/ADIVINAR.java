package adivinar;

import java.util.Scanner;

public class ADIVINAR {

    public static void main(String[] args) {
        int numeroAzar = (int) (Math.random() * 100 + 1);

        System.out.println("Tienes 5 intentos para adivinar el número. ");
        System.out.println("El número está entre 0 y 100.");

        int cont = 0;
        int num;

        while (cont < 5) {
            cont++;
            System.out.println("Ingresa un número: ");
            Scanner leer = new Scanner(System.in);
            num = leer.nextInt();

            if (num == numeroAzar) {
                System.out.println("Bien! Adivinaste el número en el intento número " + cont);
                System.out.println("");
                break;
                //cont = 20000;
            } else if (num > numeroAzar) {
                System.out.println("El número que intentas adivinar es menor.");
                System.out.println("Te quedan " + (5 - cont) + " intentos.");
                System.out.println("");
            } else {
                System.out.println("El número que intentas adivinar es mayor.");
                System.out.println("Te quedan " + (5 - cont) + " intentos.");
                System.out.println("");
            }
        }

        if (cont == 5) {
            System.out.println("Mejor suerte a la próxima.");
        }
    }
}
