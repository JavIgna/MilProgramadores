package colegio;

import java.util.ArrayList;
import java.util.Scanner;

public class Colegio {
    
    private static ArrayList<Curso> cursos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        int opcion = 13;        
        do {
            opcion = menu();
            switch(opcion){
                case 1:
                    System.out.println("Ha seleccionado la opcion Agreegar "
                            + "Curso");
                    String codigo, tipo, nivel;
                    System.out.println("Ingrese el código del nuevo Curso");
                    codigo = tcld.next();
                    System.out.println("Ingrese el tipo del nuevo Curso");
                    tipo = tcld.next();
                    System.out.println("Ingrese el nivel del nuevo Curso");
                    nivel = tcld.next();
                    Curso curso = new Curso(codigo, nivel, tipo);
                    cursos.add(curso);
                    System.out.println("El curso ha sido agregado exitosamente... \n");
                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
            }
        } while (opcion !=13);
    }

    public static int menu() {
        int opcion = -1;
        Scanner tcld = new Scanner(System.in);
        System.out.println("...::: Menú :::...");
        System.out.println("1. Agregar Curso");
        System.out.println("2. Ver Curso");
        System.out.println("3. Borrar Curso");
        System.out.println("4. Agregar Estudiante");
        System.out.println("5. Agregar Estudiante a Curso");
        System.out.println("6. Promover Estudiante");
        System.out.println("7. Buscar Estudiante");
        System.out.println("8. Ver Notas de Estudiante");
        System.out.println("9. Promedio de un Curso");
        System.out.println("10. Proedio General");
        System.out.println("11. Ver Estudiantes de un Curso");
        System.out.println("12. Agregar Notas de Estudiantes");
        System.out.println("13. Salir");
        System.out.println("");
        do {
            System.out.println("Ingresa una opción (válida)");
            opcion = tcld.nextInt();
        } while (opcion < 1 || opcion > 13);
        return opcion;
    }
}
