package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {

	public static void main(String[] args) {
		
		System.out.println("Ingresa tu nombre");

		Scanner leer = new Scanner(System.in);

		String name;
		name = leer.nextLine();
		int largo = name.length();
		int suma = 0;

		char[] nombre = new char[largo];

		for (int i = 0; i < largo; i++) {
			nombre[i] = name.charAt(i);
		}

		for (int i = 0; i < largo; i++) {
			suma = suma + nombre[i];
		}
		
		System.out.println(suma);

	}

}
