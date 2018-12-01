package biblioteca;

import java.util.ArrayList;

public class Planta extends Support {

    private static ArrayList<Estanteria> estanterias = new ArrayList<>();
    private int numPlanta;

    public Planta(int numPlanta) {
        if (enRango(1, 3, 3)) {
            this.numPlanta = numPlanta;
        } else {
            System.out.println("Los datos ingresados son inválidos...");
        }
    }

    public int getNumPlanta() {
        return numPlanta;
    }

    public void setNumPlanta(int numPlanta) {
        this.numPlanta = numPlanta;
    }
}
