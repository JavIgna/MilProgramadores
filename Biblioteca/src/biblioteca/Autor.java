package biblioteca;

import java.util.ArrayList;

public class Autor {

    private static ArrayList<Libro> libros = new ArrayList<>();
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) throws Exception {
        if (verificar(nombre, nacionalidad)) {
            this.nombre = nombre;
            this.nacionalidad = nacionalidad;
        } else {
            throw new Exception ("Los datos ingresados son inválidos...");
        }
              
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    private boolean verificar(String nombre, String nacionalidad) {
        return nombre.length() > 2 && nombre.length() < 20
                && nacionalidad.length() > 5 && nacionalidad.length() < 20;
    }
}
