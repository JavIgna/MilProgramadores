package positivo_negativo;

import java.util.Scanner;


public class POSITIVO_NEGATIVO {

   
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.println("Ingresa un número:");
        double num = get.nextDouble();
        
        System.out.println("El número es: " +((num<0)? "negativo." : "positivo."));
    }
    
}
