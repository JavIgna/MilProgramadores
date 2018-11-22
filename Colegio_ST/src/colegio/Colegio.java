package colegio;

import java.util.ArrayList;
import java.util.Scanner;

public class Colegio {

    private static ArrayList<Curso> cursos = new ArrayList<>();
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);
        int opcion = 13;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado la opcion Agregar "
                            + "Curso");
                    String codigo;
                    String tipo;
                    String nivel;
                    System.out.println("Ingrese el código del nuevo Curso");
                    codigo = tcld.next();
                    System.out.println("Ingrese el tipo del nuevo Curso");
                    tipo = tcld.next();
                    System.out.println("Ingrese el nivel del nuevo Curso");
                    nivel = tcld.next();
                    Curso curso = new Curso(codigo, nivel, tipo);
                    cursos.add(curso);
                    System.out.println("El curso ha sido agregado exitosamente"
                            + "... \n");
                    break;
                case 2:
                    for (Curso cur : cursos) {
                        System.out.println(cur.toString() + "\n");
                    }
                    break;
                case 3:
                    int op = -1;
                    op = menuBorrar();
                    if (op != 3) {
                        for (int i = 0; i < cursos.size(); i++) {
                            System.out.println("Posición: " + (i + 1) + ":."
                                    + "\n" + cursos.get(i).toString());
                        }

                        switch (op) {
                            case 1: //por codigo
                                System.out.println("Ingresa el Código del "
                                        + "Curso a Borrar: ");
                                codigo = tcld.next();
                                removeCurso(codigo);
                                break;
                            case 2: //por Posición
                                int pos = tcld.nextInt();
                                removeCurso(pos);
                                break;
                            case 3:
                                op = 3;
                        }
                        break;
                    }

                case 4:
                    pedirEstudiante();
                    break;

                case 5:
                    mostrarCursos();
                    System.out.println("Ingresa el código del Curso al cual "
                            + "agregar el Estudiante");
                    Curso cu;
                    do {
                        String cod = tcld.next();
                        cu = pedirCurso(cod);

                        if (cu == null) {
                            System.out.println("El código ingresado no coincide");
                        }
                    } while (cu == null);
                    
                    
            }
        } while (opcion != 13);
    }

    public static int menu() {
        int opcion = -1;
        Scanner tcld = new Scanner(System.in);
        System.out.println("...::: Menú :::...");
        System.out.println("1. Agregar Curso");
        System.out.println("2. Ver Cursos");
        System.out.println("3. Borrar Curso");
        System.out.println("4. Agregar Estudiante");
        System.out.println("5. Agregar Estudiante a Curso");
        System.out.println("6. Promover Estudiante");
        System.out.println("7. Buscar Estudiante");
        System.out.println("8. Ver Notas de Estudiante");
        System.out.println("9. Promedio de un Curso");
        System.out.println("10. Promedio General");
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

    public static void removeCurso(int index) {
        Colegio.cursos.remove(index);
    }

    public static boolean removeCurso(String codigo) {
        boolean is = false;
        for (int i = 0; i < Colegio.cursos.size(); i++) {
            if (Colegio.cursos.get(i).getCodigo().equals(codigo)) {
                is = true;
                Colegio.cursos.remove(i);
                break;
            }
        }
        return is;
    }

    public static int menuBorrar() {
        int opcion = -1;
        Scanner tcld = new Scanner(System.in);
        System.out.println("...::: Menú Borrar :::...");
        System.out.println("1. Borrar por Código Curso");
        System.out.println("2. Borrar por Curso");
        System.out.println("3. Cancelar");
        System.out.println("");
        do {
            System.out.println("Ingresa una opción (válida)");
            opcion = tcld.nextInt();
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }

    private static void pedirEstudiante() {
        Scanner tcld = new Scanner(System.in);
        System.out.println("Ha seleccionado la opcion Agregar "
                + "Estudiante");
        String run;
        String nombre;
        String apellidos;
        int edad;
        System.out.println("Ingrese el RUN del Estudiante");
        run = tcld.next();
        System.out.println("Ingrese el Nombre del Estudiante");
        nombre = tcld.next();
        System.out.println("Ingrese los Apellidos del Estudiante");
        apellidos = tcld.next();
        System.out.println("Ingrese la Edad del Estudiante");
        edad = tcld.nextInt();
        Estudiante estudiante
                = new Estudiante(run, nombre, apellidos, edad);
        estudiantes.add(estudiante);
        System.out.println("El Estudiante ha sido agregado exitosamente"
                + "... \n");
    }

    private static void mostrarCursos() {
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("Posición: " + (i + 1) + ":."
                    + "\n" + cursos.get(i).toString());
        }
    }

    private static Curso pedirCurso(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }
}
