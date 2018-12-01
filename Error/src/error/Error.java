package error;

import java.util.Scanner;

public class Error {

    public static void main(String[] args) {
        int numero = 0;
        numero = pedirNumero();
    }
    
    public static int pedirNumero(){
        Scanner get = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = 0;
        try {
            numero = get.nextInt();
        } catch (Exception e) {
            System.out.println("Ingresó un tipo de dato que no corresponde");
            String num = get.next();
            numero = pedirNumero();
        }
    return numero;
    }
}
