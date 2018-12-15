/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author JavieR
 */
public class CuentaAhorro {

    private int numCuenta;
    private String titular;
    private double saldo;
    private double interes;

    public CuentaAhorro(int numCuenta, String titular, double saldo, double interes) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.interes = interes;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
}
