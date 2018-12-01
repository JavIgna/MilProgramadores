package biblioteca;

import java.util.ArrayList;

public class Tematica {

    private static ArrayList<EstanteriaTematica> estanteriasTematicas = new ArrayList<>();
    private static ArrayList<Libro> libros = new ArrayList<>();
    
    private String nombreTipo;

    public Tematica(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
}
