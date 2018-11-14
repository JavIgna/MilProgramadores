/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author andressencediurno
 */
public class JavaApplication9 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here

			int var1 = 5;
			int var2 = 2;

			System.out.println("valor de var1 es: " + var1);
			acumular(var1, var2);
			System.out.println("valor de var1 es: " + var1);
		}
	
	

	public static void acumular(int a, int b) {
		a = a + b;
	}

}
