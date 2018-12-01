package clasesdeobjeto;

import java.util.ArrayList;

public class Persona {

    //Atributos
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;

    //Relaciones
    private ArrayList<Mascota> listaMascota;

    //Constructor/es
    public Persona(String rut, String nombre, String apellido, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.listaMascota = new ArrayList<>();
    }

    //Métodos
    public void addMascota(Mascota mas) {
        if (mas.getDuenio() == null) {
            mas.setDuenio(this);
            listaMascota.add(mas);
        }
    }

    public int getCantMascotas() {
        return this.listaMascota.size();
    }
    
    public void removeMascota(Mascota mas){
        this.listaMascota.remove(mas);
    }
    
    public void removeMascota(int pos){
        this.listaMascota.remove(pos);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado += "RUT: " + this.rut + "\n";
        resultado += "Nombre: " + this.nombre + "\n";
        resultado += "Apellido: " + this.apellido + "\n";
        resultado += "Edad: " + this.edad + "\n";
        return resultado;
    }

    /*public boolean equals(Persona p) {
        boolean resultado;
        if (this.rut != p.rut) {
            resultado = false;
        } else {
            resultado = true;
        }
        return resultado;
    }
     */
    @Override
    public boolean equals(Object o) {
        boolean resultado = false;

        if (o instanceof Persona) {
            Persona n = (Persona) o;
            if (this.getRut().equals(n.getRut())) {
                resultado = true;
            }
        }
        return resultado;
    }
}
