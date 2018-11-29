/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author guillermofuentesquijada
 */
public class Archivo {

    public static final String PATH = "entrada/mi_archivo.in";
    public static final String PATH2 = "entrada/matriz.in";
    public static final String PATH_DESTINO = "salida/";
    public static final String TIPO_ARCHIVO = ".out";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        Scanner tcld = new Scanner(System.in);
        Persona persona = null;
        FileReader reader = null;
        try {
            reader = new FileReader(PATH2);
        } catch (FileNotFoundException ex) {
            System.out.println("Ha ocurrido un error al buscar el archivo.");
            System.exit(0);
        }
        Scanner in = new Scanner(reader);
        in.useLocale(Locale.US);

        int filas = in.nextInt();
        int columnas = in.nextInt();
        int[][] matriz = new int[filas][columnas];
        int [][] matriz2 = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = in.nextInt();
            }
        }
        
        String guardarArchivo = PATH_DESTINO + "mt" + TIPO_ARCHIVO;
        
        FileWriter archivo = null;
        try {
            archivo = new FileWriter(guardarArchivo, true); //false el archivo se sobreescribe, true se escribe desde la linea en la que quedo
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error al crear el archivo de destino.");
            System.exit(0);
        }
        PrintWriter writer = new PrintWriter(archivo);
        
        
        
        
        writer.println(columnas);
        writer.println(filas);

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz2[y][x] = matriz[x][y];
            }
        }

        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                writer.print(matriz2[i][j] + "\t");
            }
            writer.println("");
        }
        
        tcld.close();
        writer.close();
       
        /*        while (in.hasNext()) {
            String nombre, apellido;
            int numRun;
            char dvRun;
            
            nombre = in.next();
            apellido = in.next();
            numRun = in.nextInt();
            dvRun = in.next().charAt(0);
            
            persona = new Persona(nombre, apellido, numRun, dvRun);
            personas.add(persona);
        }
        
        for (Persona e : personas) {
            System.out.println(e);
        }
        
//        System.exit(0);
        
        try {
            reader.close();
            in.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el archivo.");
        }
        
        System.out.println("Ingrese el nombre del archivo: ");
        String nombreArchivo = tcld.next();
        
        String guardarArchivo = PATH_DESTINO + nombreArchivo + TIPO_ARCHIVO;
        
        FileWriter archivo = null;
        try {
            archivo = new FileWriter(guardarArchivo, true); //false el archivo se sobreescribe, true se escribe desde la linea en la que quedo
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error al crear el archivo de destino.");
            System.exit(0);
        }
        PrintWriter writer = new PrintWriter(archivo);
        
        for (Persona e : personas) {
            writer.println(e);
        }
        tcld.close();
        writer.close();*/
    }

}
