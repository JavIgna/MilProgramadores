package reservadevuelos;

public class Tarifa {

    //Atributos
    private String clase;
    private double precio;
    private double impuestos;

    //Relaciones
    private Vuelo vuelo;

    //Constructores
    public Tarifa(String clase, double precio, double impuestos) {
        this.clase = clase;
        this.precio = precio;
        this.impuestos = impuestos;
    }
}
