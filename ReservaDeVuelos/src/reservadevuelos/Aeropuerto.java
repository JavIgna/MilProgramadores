package reservadevuelos;

import java.util.ArrayList;

public class Aeropuerto {

    //Atributos
    private String nombre;
    private String ciudad;
    private String pais;

    //Relaciones
    private ArrayList<Vuelo> vuelosDestino = new ArrayList<>();
    private ArrayList<Vuelo> vuelosSalida = new ArrayList<>();
    private ArrayList<Vuelo> vuelosEscala = new ArrayList<>();

    //Constructor
    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
    }
}
