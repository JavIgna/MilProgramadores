
package tiendafotografia;

import java.util.ArrayList;

public class Cliente {
    
    ArrayList<Multa> multas = new ArrayList<>();
    
    private String nombre;
    private String rut;
    private String direccion;

    public Cliente(String nombre, String rut, String direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", rut=" + rut + ", direccion=" + direccion + '}';
    }
}
