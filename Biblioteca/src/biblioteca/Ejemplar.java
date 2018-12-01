package biblioteca;

import java.util.ArrayList;

public class Ejemplar {
    
    private static ArrayList<Prestamo> prestamos = new ArrayList<>();
    private int id;

    public Ejemplar(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
