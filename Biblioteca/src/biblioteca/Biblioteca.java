package biblioteca;

import java.util.ArrayList;

public class Biblioteca extends Support {

    private static ArrayList<Planta> plantas = new ArrayList<>();
    private String nombre;

    public Biblioteca(String nombre) {
        if (enRango(2, 50, nombre.length())) {
            this.nombre = nombre;
        } else {
            System.out.println("Los datos ingresados son incorrectos...");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {

    }
}
