package tiendafotografia;

import java.util.ArrayList;

public class Camara {

    private String modelo;
    private boolean soporteFlash;

    private ArrayList<Pelicula> peliculas = new ArrayList<>();
    private ArrayList<Marca> marcas = new ArrayList<>();

    public Camara(String modelo, boolean soporteFlash) {
        this.modelo = modelo;
        this.soporteFlash = soporteFlash;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isSoporteFlash() {
        return soporteFlash;
    }

    public void setSoporteFlash(boolean soporteFlash) {
        this.soporteFlash = soporteFlash;
    }

    @Override
    public String toString() {
        return "Camara{" + "modelo=" + modelo + ", soporteFlash=" + soporteFlash + ", peliculas=" + peliculas + ", marcas=" + marcas + '}';
    }
}
