package colegio;

import java.awt.BorderLayout;
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
                    System.out.println("Ha seleccionado la opción Agregar Curso");
                    String codigo,
                     tipo;
                    int nivel;
                    System.out.println("Ingrese el código del nuevo Curso");
                    codigo = tcld.next();
                    System.out.println("Ingrese el nivel del nuevo Curso");
                    nivel = tcld.nextInt();
                    System.out.println("Ingrese el tipo del nuevo Curso");
                    tipo = tcld.next();

                    Curso curso = new Curso(codigo, nivel, tipo);
                    cursos.add(curso);
                    System.out.println("El curso ha sido agregado exitosamente... \n");
                    break;
                case 2:
                    if (cursos.size() > 0) {
                        mostrarCursos();
                        System.out.println("\n");
                    } else {
                        System.out.println("No hay cursos disponibles\n\n");
                    }
                    break;
                case 3:
                    if (cursos.size() > 0) {
                        mostrarCursos();
                        int num = -1;
                        do {
                            System.out.println("\nIngrese el Nro del curso a borrar (válido):");
                            num = tcld.nextInt();
                        } while (num < 1 || num > cursos.size());

                        cursos.remove(num - 1);
                        System.out.println("Se ha borrado exitosamente el curso.");
                    } else {
                        System.out.println("No hay cursos disponibles\n\n");
                    }
                    break;
                case 4:
                    System.out.println("Ha seleccionado la opción Agregar Estudiante");
                    String run,
                     nombre,
                     apellido;
                    int edad;
                    System.out.println("Ingrese el run del nuevo Estudiante");
                    run = tcld.next();
                    System.out.println("Ingrese el nombre del nuevo Estudiante");
                    nombre = tcld.next();
                    System.out.println("Ingrese el apellido del nuevo Estudiante");
                    apellido = tcld.next();
                    System.out.println("Ingrese la edad del nuevo Estudiante");
                    edad = tcld.nextInt();
                    Estudiante estudiante = new Estudiante(run, nombre, apellido, edad);
                    estudiantes.add(estudiante);
                    System.out.println("El estudiante ha sido agregado exitosamente... \n");
                    break;
                case 5:
                    System.out.println("Ha seleccionado la opción Agregar Estudiante a Curso");
                    if (cursos.size() > 0 && estudiantes.size() > 0) {
                        mostrarCursos();
                        int numCurso = 0;
                        do {
                            System.out.println("Ingrese el número del curso en donde agregará el estudiante");
                            numCurso = tcld.nextInt();
                        } while (numCurso < 1 || numCurso > cursos.size());

                        Curso curso_aux = cursos.get(numCurso - 1);
                        mostrarEstudiantes();
                        int numEstudiante = 0;
                        do {
                            System.out.println("Ingrese el número del curso en donde agregará el estudiante");
                            numEstudiante = tcld.nextInt();
                        } while (numEstudiante < 1 || numEstudiante > estudiantes.size());

                        Estudiante estudiante_aux = estudiantes.get(numEstudiante - 1);

                        curso_aux.addEstudiante(estudiante_aux);

                        System.out.println("Se ha agregado exitosamente el estudiante al curso");
                    } else {
                        if (cursos.size() == 0) {
                            System.out.println("No hay cursos para agregar un estudiante");
                        } else {
                            System.out.println("No hay estudiantes para agregar a un curso");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Ha seleccionado la opción Promover Estudiante");
                    if (cursos.size() > 0 && estudiantes.size() > 0) {
                        mostrarCursos();
                        int numCurso = 0;
                        do {
                            System.out.println("Ingrese el número del curso en donde agregará el estudiante");
                            numCurso = tcld.nextInt();
                        } while (numCurso < 1 || numCurso > cursos.size());

                        Curso curso_aux = cursos.get(numCurso - 1);
                        mostrarEstudiantes();
                        int numEstudiante = 0;
                        do {
                            System.out.println("Ingrese el número del estudiante el cual se agregará a un curso");
                            numEstudiante = tcld.nextInt();
                        } while (numEstudiante < 1 || numEstudiante > estudiantes.size());

                        Estudiante estudiante_aux = estudiantes.get(numEstudiante - 1);
                        boolean encontrado = false;
                        for (int i = 0; i < cursos.size(); i++) {
                            Curso c_aux = cursos.get(i);
                            for (int j = 0; j < c_aux.sizeEstudiantes(); j++) {
                                if (c_aux.searchEstudiante(j).equals(estudiante_aux)) {
                                    c_aux.removeEstudiante(j);
                                    encontrado = true;
                                    break;
                                }
                            }
                            if (encontrado) {
                                break;
                            }
                        }

                        curso_aux.addEstudiante(estudiante_aux);

                        System.out.println("Se ha agregado exitosamente el estudiante al curso");
                    } else {
                        if (cursos.size() == 0) {
                            System.out.println("No hay cursos para agregar un estudiante");
                        } else {
                            System.out.println("No hay estudiantes para agregar a un curso");
                        }
                    }
                    break;
                case 7:

                    buscarEstudiante();
                    break;

                case 8:
                    if (estudiantes.size() > 0) {
                        System.out.println("Ha ingresado a la opción Ver Notas de Estudiante");
                        //Mostrar Estudiante
                        mostrarEstudiantes();

                        //Seleccionar Estudiante
                        System.out.println("Ingresa el indice del estudiante solicitado");
                        int indice = tcld.nextInt();
                        indice--;

                        Estudiante e = estudiantes.get(indice);

                        //Obtener Notas
                        if (e.sizeNota() < 1) {
                            System.out.println("El estudiante " + e.getNombre() + " " + e.getApellidos() + " no tiene notas");
                        } else {
                            System.out.println(e.getNombre() + ":");
                            for (int i = 0; i < e.sizeNota(); i++) {
                                System.out.print(e.getNota(i) + ", ");
                            }
                        }
                    } else {
                        System.out.println("No hay estudiantes en nuestros registros");
                    }
                    break;
                case 9:
                    if (cursos.size() > 0) {
                        System.out.println("Ha ingresado a la opción Promedio Curso");
                        //Mostrar Cursos
                        mostrarCursos();

                        //Seleccionar Curso
                        System.out.println("Ingresa el codigo del Curso");
                        codigo = tcld.next();
                        Curso c = null;
                        for (int i = 0; i < cursos.size(); i++) {
                            if (cursos.get(i).getCodigo().equals(codigo)) {
                                c = cursos.get(i);
                            }
                        }
                        if (c == null) {
                            System.out.println("El Curso no ha sido agregado a nuestros registros");
                        } else {
                            double prom = c.promedioGeneral();

                            //Mostrar prom
                            if (prom == 0) {
                                System.out.println("No hay alumnos registrados en este Curso");
                            } else {
                                System.out.println("El promedio del Curso es: " + prom);
                            }
                        }
                    } else {
                        System.out.println("No hay cursos en nuestros registros");
                    }
                    break;
                case 10:
                    //Comprobar si hay cursos
                    if (cursos.size() > 0) {
                        System.out.println("Ha ingresado a la opción Promedio General");

                        //Sumar promedios cursos
                        double suma = 0;
                        for (int i = 0; i < cursos.size(); i++) {
                            suma += cursos.get(i).promedioGeneral();
                        }

                        //Dividir suma promedios cursos en cantidad cursos
                        double prom = suma / cursos.size();

                        //Mostrar el promedio Gral
                        System.out.println("El promedio General es: " + prom);
                    } else {
                        System.out.println("No hay cursos en nuestros registros");
                    }
                    break;
                case 11:
                    //Comprobar si hay cursos
                    if (cursos.size() > 0) {
                        //Mostrar cursos
                        mostrarCursos();

                        //Seleccionar curso
                        System.out.println("Ingresa el codigo del Curso");
                        codigo = tcld.next();
                        Curso c = null;
                        for (int i = 0; i < cursos.size(); i++) {
                            if (cursos.get(i).getCodigo().equals(codigo)) {
                                c = cursos.get(i);
                            }
                        }
                        if (c == null) {
                            System.out.println("El Curso no ha sido agregado a nuestros registros");
                        } else {
                            //Mostrar estudiantes
                            c.mostrarEstudiantes();
                        }
                    } else {
                        System.out.println("No hay cursos en nuestros registros");
                    }

                    break;
                case 12:
                    //Cursos?
                    if (cursos.size() > 0) {
                        //Mostrar cursos
                        mostrarCursos();

                        //Seleccionar curso
                        System.out.println("Ingresa el codigo del Curso");
                        codigo = tcld.next();
                        Curso c = null;
                        for (int i = 0; i < cursos.size(); i++) {
                            if (cursos.get(i).getCodigo().equals(codigo)) {
                                c = cursos.get(i);
                            }
                        }
                        if (c == null) {
                            System.out.println("El Curso no ha sido agregado a nuestros registros");
                        } else {
                            //Estudiantes?
                            if (c.tieneEstudiantes()) {
                                //Mostrar estudiante
                                c.mostrarEstudiantes();

                                //Seleccionar Estudiante
                                System.out.println("Ingresa el indice del estudiante solicitado");
                                int indice = tcld.nextInt();
                                indice--;
                                Estudiante e = estudiantes.get(indice);
                                
                                //Agregar nota
                                    //pedir nota y asignatura
                                System.out.println("Introduzca la nota del estudiante");
                                double nota = tcld.nextDouble();
                                
                                System.out.println("Introduzca la asignatura de la nota");
                                String asignatura = tcld.next();
                                
                                Nota n = new Nota(nota, asignatura);
                                e.addNota(n);
                                
                                System.out.println("La nota ha sido agregada satisfactoriamente");
                            }
                        }

                    } else {
                        System.out.println("No hay cursos en nuestros registros");
                    }
                    break;
                case 13:
                    System.out.println("Adiós <3");
            }
        } while (opcion != 13);
    }

    public static void mostrarEstudiantes() {
        System.out.println("Los estudiantes disponibles son:\n");
        System.out.println("Nro\tRun\tNombre\tApellido\tEdad");
        for (int i = 0; i < estudiantes.size(); i++) {
            Estudiante aux = estudiantes.get(i);
            System.out.println((i + 1) + "\t" + aux.getRun() + "\t"
                    + aux.getNombre() + "\t" + aux.getApellidos() + "\t"
                    + aux.getEdad());
        }
    }

    public static void mostrarCursos() {
        System.out.println("Los cursos disponibles son:\n");
        System.out.println("Nro\tCodigo\tNivel\tTipo");
        for (int i = 0; i < cursos.size(); i++) {
            Curso aux = cursos.get(i);
            System.out.println((i + 1) + "\t" + aux.getCodigo() + "\t"
                    + aux.getNivel() + "\t" + aux.getTipo());
        }
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
        System.out.println();
        do {
            System.out.println("Ingrese una opción (válida)");
            opcion = tcld.nextInt();
        } while (opcion < 1 || opcion > 13);
        return opcion;
    }

    private static void buscarEstudiante() {
        Scanner tcld = new Scanner(System.in);

        if (estudiantes.size() > 0) {
            System.out.println("Ha seleccionado la opción Buscar Estudiante");
            System.out.println("Ingrese el run del estudiante a buscar:");
            String run_buscar = tcld.next();
            boolean se_encontro = false;

            for (int i = 0; i < estudiantes.size(); i++) {
                Estudiante aux_estudiante = estudiantes.get(i);
                if (aux_estudiante.getRun().equals(run_buscar)) {
                    System.out.println("RUN : " + aux_estudiante.getRun());
                    System.out.println("Nombre: " + aux_estudiante.getNombre());
                    System.out.println("Apellido: " + aux_estudiante.getApellidos());
                    System.out.println("Edad: " + aux_estudiante.getEdad());
                    se_encontro = true;
                }
            }
            if (!se_encontro) {
                System.out.println("No se ha encontrado el run en nuestros registros");
            }
        } else {
            System.out.println("No se ha ingresado ningún estudiante a nuestro registro");
        }
    }
}
