package reservadevuelos;

import java.util.ArrayList;

public class Aerolinea {

    //Atributos
    private String nombre;

    //Relaciones 
    ArrayList<Avion> aviones = new ArrayList<Avion>();
    ArrayList<Vuelo> vuelos = new ArrayList<>();

    //Constructores
    public Aerolinea(String nombre) {
        this.nombre = nombre;
    }

    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addAvion(Avion av) {
        this.aviones.add(av);
    }

    public int sizeAviones() {
        return this.aviones.size();
    }

    public void removeAviones(int index) {
        this.aviones.remove(index);
    }

    public void removeAviones(Avion av) {
        this.aviones.remove(av);
    }
}
