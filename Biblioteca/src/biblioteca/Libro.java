package biblioteca;

import java.util.ArrayList;

public class Libro {
    
    private static ArrayList<Ejemplar> ejemplares = new ArrayList<>();
    private String nombre;
    private String isbn;

    public Libro(String nombre, String isbn) {
        this.nombre = nombre;
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
