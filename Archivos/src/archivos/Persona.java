/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

/**
 *
 * @author guillermofuentesquijada
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int numRut;
    private char dvRun;

    public Persona(String persona, String nombre, int numRut, char dvRun) {
        this.nombre = persona;
        this.apellido = nombre;
        this.numRut = numRut;
        this.dvRun = dvRun;
    }

    public String getPersona() {
        return nombre;
    }

    public void setPersona(String persona) {
        this.nombre = persona;
    }

    public String getNombre() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.apellido = nombre;
    }

    public int getNumRut() {
        return numRut;
    }

    public void setNumRut(int numRut) {
        this.numRut = numRut;
    }

    public char getDvRun() {
        return dvRun;
    }

    public void setDvRun(char dvRun) {
        this.dvRun = dvRun;
    }

    @Override
    public String toString() {
        return "Persona{" + "persona=" + nombre + ", nombre=" + apellido + ", numRut=" + numRut + ", dvRun=" + dvRun + '}';
    }
    
    
}
