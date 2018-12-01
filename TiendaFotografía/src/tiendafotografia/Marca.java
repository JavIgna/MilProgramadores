
package tiendafotografia;

import java.util.ArrayList;

public class Marca {
    
    ArrayList<Pelicula> peliculas = new ArrayList<>();
    
    private String nombre;

    public Marca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Marca{" + "nombre=" + nombre + '}';
    }    
}
