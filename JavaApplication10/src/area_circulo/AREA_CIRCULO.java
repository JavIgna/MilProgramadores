package area_circulo;

import java.util.Scanner;

public class AREA_CIRCULO {

    static final double NUM_PI = Math.PI;

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el radio de un circulo en centimetros: ");
        double radio = leer.nextDouble();

        double area = NUM_PI * Math.pow(radio, 2);
        area = Math.floor(area * 100) / 100;
        System.out.println("El área del circulo es: " + area + " centimetros cuadrados.");

    }
}
