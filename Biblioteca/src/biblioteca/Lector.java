package biblioteca;

import java.util.ArrayList;

public class Lector {

    private static ArrayList<Prestamo> prestamos = new ArrayList<>();
    private static ArrayList<PenalizacionLector> penalizacionesLector = new ArrayList<>();

    private String nombre;
    private String direccionPostal;
    private String dni;

    public Lector(String nombre, String direccionPostal, String dni) {
        this.nombre = nombre;
        this.direccionPostal = direccionPostal;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }

    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
