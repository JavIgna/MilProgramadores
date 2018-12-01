package reservadevuelos;

import java.util.ArrayList;

public class Reserva {

    //Atributos
    private String clave;
    private double costoTotal;

    //Relaciones
    private ArrayList<Vuelo> vuelos = new ArrayList<>();
    private ArrayList<Pasajero> pasajeros = new ArrayList<>();
    private ArrayList<Pago> pagos = new ArrayList<>();

    //Constructores
    public Reserva(String clave, double costoTotal) {
        this.clave = clave;
        this.costoTotal = costoTotal;
    }
}
