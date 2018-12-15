/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author JavieR
 */
public class Persona {
    private String rut;
    private String nombre;
    private String apellidos;
    private String domicilio;

    public Persona(String rut, String nombre, String apellidos) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona(String rut, String nombre, String apellidos, String domicilio) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
    }
}
