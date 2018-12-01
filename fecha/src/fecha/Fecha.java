package fecha;

import java.util.Scanner;

public class Fecha {

    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        System.out.println("Ingrese una fecha día, mes y anio (dd/mm/aaaa ó dd-mm-aaaa)");
        String fechaString = tcld.next();
        int dia = 0, mes = 0, anio = 0;
        if (fechaString.contains("/")) {
            String[] datos = fechaString.split("/");

            dia = Integer.parseInt(datos[0]);
            mes = Integer.parseInt(datos[1]);
            anio = Integer.parseInt(datos[2]);

//            for (String elemento : datos) {
//                System.out.println("elemento: " + elemento);
//            }
    
        } else {
            if (fechaString.contains("-")) {
                String[] datos = fechaString.split("-");

                dia = Integer.parseInt(datos[0]);
                mes = Integer.parseInt(datos[1]);
                anio = Integer.parseInt(datos[2]);

//                for (String elemento : datos) {
//                    System.out.println("elemento: " + elemento);
//                }
            } else {
                System.out.println("Ingresó un formato desconocido");
            }
        }
    }
}
