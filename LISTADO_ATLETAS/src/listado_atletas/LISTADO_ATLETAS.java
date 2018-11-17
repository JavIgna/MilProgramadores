package listado_atletas;

import java.util.Scanner;

public class LISTADO_ATLETAS {

    public static void main(String[] args) {

        int fil = 10, col = 5;
        String[][] listado = new String[fil][col];
        int op;

        Scanner pedir = new Scanner(System.in);

        do {
            System.out.println("***MENÚ***");
            System.out.println("Presiona el número + enter según la opción deseada:");
            System.out.println("1- Incribir un participante.");
            System.out.println("2- Mostrar los datos de un atleta.");
            System.out.println("3- Mostrar listado de datos.");
            System.out.println("4- Mostrar listado por marcas.");
            System.out.println("5- Finalizar el programa.");

            op = pedir.nextInt();

            switch (op) {
                case 1:
                    int cont = 0;
                    for (int i = 0; i < fil; i++) {
                        if (listado[i][0] == null) {
                            cont = i;
                            i = fil;
                        }
                    }
                    if (cont != 9) {
                        for (int i = 0; i < col; i++) {
                            switch (i) {
                                case 0:
                                    listado[cont][i] = "" + (cont + 1);
                                    break;
                                case 1:
                                    System.out.println("Ingresa el nombre:");
                                    listado[cont][i] = pedir.next();
                                    break;
                                case 2:
                                    System.out.println("Ingresa mejor marca del año 2002:");
                                    listado[cont][i] = pedir.next();
                                    break;
                                case 3:
                                    System.out.println("Ingresa mejor marca del año 2001:");
                                    listado[cont][i] = pedir.next();
                                    break;
                                case 4:
                                    System.out.println("Ingresa mejor marca del año 2000:");
                                    listado[cont][i] = pedir.next();
                                    break;
                            }
                        }
                    } else {
                        System.out.println("Los cupos son limitados.");
                        System.out.println("Estas exediendo los cupos1.");
                    }
                    break;
                case 2:
                    int dorsal;
                    int cont2 = 0;
                    do {
                        for (int i = 0; i < fil; i++) {
                            if (listado[i][0] == null) {
                                cont2 = i;
                                i = fil;
                            }
                        }
                        do {
                            System.out.println("Ingresa el dorsal del participante a mostrar:");
                            dorsal = pedir.nextInt();

                            if (dorsal > cont2) {
                                System.out.println("El cupo no a sido llenado, favor intente un dorsal menor  o igual a " + cont2 + ".\n");
                            }
                        } while (dorsal > cont2);
                    } while ((dorsal < 1) && (dorsal > cont2));
                    System.out.print("Dorsal: " + listado[dorsal - 1][0] + ". Nombre: " + listado[dorsal - 1][1] + ". Marca 2002: " + listado[dorsal - 1][2] + ". Marca 2001: " + listado[dorsal - 1][3] + ". Marca 2000: " + listado[dorsal - 1][4] + ".\n");
                    break;
                case 3:
                    int cont3 = 0;
                    for (int i = 0; i < fil; i++) {
                        if (listado[i][0] == null) {
                            cont3 = i;
                            i = fil;
                        }
                    }
                    for (int i = 0; i < cont3; i++) {
                        datosJugador(listado, i);
                    }
                    break;
                case 4:
                    int cont4 = 0;
                    for (int i = 0; i < fil; i++) {
                        if (listado[i][0] == null) {
                            cont4 = i;
                            i = fil;
                        }
                    }
                    int[][] ordenados2002 = new int[cont4][(cont4)];
                    for (int i = 0; i < cont4; i++) {
                        ordenados2002[i][1] = Integer.valueOf(listado[i][2]);
                        ordenados2002[i][0] = Integer.valueOf(listado[i][0]);
                    }
                    int aux;
                    for (int i = 0; i < cont4; i++) {
                        for (int j = 1; j < cont4; j++) {
                            if (ordenados2002[j - 1][1] > ordenados2002[j][1]) {
                                aux = ordenados2002[j][1];
                                ordenados2002[j][1] = ordenados2002[j - 1][1];
                                ordenados2002[j - 1][1] = aux;

                                aux = ordenados2002[j][0];
                                ordenados2002[j][0] = ordenados2002[j - 1][0];
                                ordenados2002[j - 1][0] = aux;
                            }
                        }
                    }
                    System.out.println("Ordenados por marca 2002: ");
                    for (int i = 0; i < cont4; i++) {
                        datosJugador(listado, ordenados2002[i][0] - 1);
                    }
                    break;
                case 5:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Ingresa una opción válida.");
                    System.out.println("");
            }
        } while (op != 5);
    }
    private static void datosJugador(String[][] listado, int dorsal) {
        System.out.println("Dorsal: " + (dorsal + 1) + ". Nombre: " + listado[dorsal][1] + ". Marca 2002: " + listado[dorsal][2] + ". Marca 2001: " + listado[dorsal][3] + ". Marca 2000: " + listado[dorsal][4] + ".\n");
    }
}
