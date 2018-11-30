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
}
