package tiendafotografia;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula {
    
    ArrayList<Marca> marcas = new ArrayList<>();
    
    private String marca;
    private String modelo;
    private LocalDate añoProduccion;
    private String nombre;
    private int sensibilidad;
    private int formato;

    public Pelicula(String marca, String modelo, LocalDate añoProduccion, String nombre, int sensibilidad, int formato) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoProduccion = añoProduccion;
        this.nombre = nombre;
        this.sensibilidad = sensibilidad;
        this.formato = formato;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getAñoProduccion() {
        return añoProduccion;
    }

    public void setAñoProduccion(LocalDate añoProduccion) {
        this.añoProduccion = añoProduccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSensibilidad() {
        return sensibilidad;
    }

    public void setSensibilidad(int sensibilidad) {
        this.sensibilidad = sensibilidad;
    }

    public int getFormato() {
        return formato;
    }

    public void setFormato(int formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "marca=" + marca + ", modelo=" + modelo + ", a\u00f1oProduccion=" + añoProduccion + ", nombre=" + nombre + ", sensibilidad=" + sensibilidad + ", formato=" + formato + '}';
    }
}
