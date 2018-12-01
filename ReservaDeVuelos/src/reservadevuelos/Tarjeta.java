package reservadevuelos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tarjeta {

    //Atributos
    private String nombre;
    private double numTarjeta;
    private String tipo;
    private LocalDate fechaVencimiento;

    //Relaciones
    private Pasajero pasajero;
    private ArrayList<Pago> pagos = new ArrayList<>();

    //Constructores
    public Tarjeta(String nombre, double numTarjeta, String tipo, LocalDate fechaVencimiento) {
        this.nombre = nombre;
        this.numTarjeta = numTarjeta;
        this.tipo = tipo;
        this.fechaVencimiento = fechaVencimiento;
    }
}
