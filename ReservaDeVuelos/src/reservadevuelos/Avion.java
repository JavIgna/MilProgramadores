package reservadevuelos;

import java.util.ArrayList;

public class Avion {

    //Atributos
    private String compania;
    private String tipo;
    private int numPasajeros;
    
    //Relaciones
    private Aerolinea aerolinea;
    private ArrayList<Vuelo> vuelos = new ArrayList<>();
    
    //Constructores

    public Avion(String compania, String tipo, int numPasajeros) {
        this.compania = compania;
        this.tipo = tipo;
        this.numPasajeros = numPasajeros;
    }
}
