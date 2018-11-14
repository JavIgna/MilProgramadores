package longitud;

import java.util.Scanner;

public class LONGITUD {

    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingresa un número entre 0 y 9999");
            num = pedir.nextInt();
            
        } while (num < 0 || num > 9999);
        
        String numero = "" + num;
        int log = numero.length();
        
        System.out.println("El número: " +num +" tiene " +log +((log==1)? " cifra.":" cifras."));
    }
}
