package reservadevuelos;

public class Asiento {

    //Atributos
    private int fila;
    private char letra;

    //Relaciones
    Vuelo vuelo;

    //Constructores
    public Asiento(int fila, char letra) {
        this.fila = fila;
        this.letra = letra;
    }
}
