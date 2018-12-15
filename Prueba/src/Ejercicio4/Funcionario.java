/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

/**
 *
 * @author JavieR
 */
public class Funcionario {
    private String rut;
    private String nombres;
    private String apellidos;
    private String domicilio;
    private String fechaDeNacimiento;
    private double sueldoBruto;

    public Funcionario(String rut, String nombres, String apellidos, String domicilio, String fechaDeNacimiento, double sueldoBruto) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.sueldoBruto = sueldoBruto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
    public String getAtributos() {
        return rut + "," + apellidos + " " + nombres + "," + fechaDeNacimiento + ", " + sueldoBruto;
    }
}
