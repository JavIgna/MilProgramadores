package verificadorrut;

import java.util.Scanner;

public class VerificadorRUT {

    public static void main(String[] args) {

        String k = "K", dig_str, RUT;
        char caracter;
        int max, verificador, cont, mult, dif, div_trunc, digito, suma = 0, multiplicador = 1;
        double div;
        System.out.println("Ingresa tu RUT sin puntos, sin guiones ni digito verificador");
        Scanner sc = new Scanner(System.in);
        RUT = sc.nextLine();
        max = RUT.length();
        int digitos[];
        digitos = new int[max];

        for (int i = max - 1; i >= 0; i--) {

            multiplicador = multiplicador + 1;
            if (multiplicador > 7) {

                multiplicador = 2;

            }

            caracter = RUT.charAt(i);
            dig_str = Character.toString(caracter);
            digito = Integer.parseInt(dig_str.trim());
            digitos[i] = multiplicador * digito;

        }

        for (int i = max - 1; i >= 0; i--) {

            suma = suma + digitos[i];

        }

        div = suma / 11;
        div_trunc = (int) div;
        mult = div_trunc * 11;
        dif = suma - mult;
        cont = 11 - dif;

        if (cont >= 11) {

            verificador = 0;
            System.out.println("El digito verificador es: " + verificador);

        } else if (cont >= 10) {

            System.out.println("El digito verificador es: " + k);

        } else {

            verificador = cont;
            System.out.println("El digito verificador es: " + verificador);

        }
    }
}
