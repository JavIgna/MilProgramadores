package reservadevuelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pago {

    //Atributos
    private String tipo;
    private LocalDate fecha;
    private double cantidad;
    
    //Relaciones
    private Reserva reserva;
    private ArrayList<Tarjeta> tarjetas = new ArrayList<>();
    
    //Constructores
    public Pago(String tipo, LocalDate fecha, double cantidad) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

}
