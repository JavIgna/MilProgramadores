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
public class Prueba_Funcionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Funcionario funcionario1 = new Funcionario("20202020-K", "Juan", "Fernández López", null, "10/10/2010", 35200);

        System.out.println(funcionario1.getAtributos());
    }

}
