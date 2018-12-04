package reservadevuelos;

import java.util.ArrayList;

public class Vuelo {

    //Atributo
    private int numVuelo;

    //Relaciones
    private Tarifa tarifa;
    private Dia salida;
    private Dia llegada;
    private Aeropuerto origen;
    private Aeropuerto destino;
    private ArrayList<Aeropuerto> escalas = new ArrayList<>();
    private ArrayList<Asiento> asientos = new ArrayList<>();
    private ArrayList<Reserva> reservas = new ArrayList<>();

    //Constructores
    public Vuelo(int numVuelo, Tarifa tarifa, Dia salida, Dia llegada, Aeropuerto origen, Aeropuerto destino) {
        this.numVuelo = numVuelo;
        this.tarifa = tarifa;
        this.salida = salida;
        this.llegada = llegada;
        this.origen = origen;
        this.destino = destino;
    }
}
