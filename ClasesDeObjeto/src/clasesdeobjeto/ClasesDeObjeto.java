package clasesdeobjeto;

import java.util.ArrayList;

public class ClasesDeObjeto {

    public static void main(String[] args) {
        String rut = "9.111.222-K";
        String nombre = "Pedro";
        String apellido = "Perez";
        int edad = 60;

        Persona persona1 = new Persona(rut, nombre, apellido, edad);
        System.out.println(persona1.toString());

        rut = "1.888.999-0";
        nombre = "Peter";
        apellido = "Peterson";
        edad = 70;

        Persona persona2 = new Persona(rut, nombre, apellido, edad);
        System.out.println(persona2.toString());

        System.out.println("Son iguales: " + persona1.equals(persona2));
        System.out.println();

        nombre = "Liq";
        char sexo = 'M';
        edad = 2;

        Mascota mascota1 = new Mascota(nombre, sexo, edad);
        
        System.out.println(mascota1.toString());

        ArrayList<Mascota> listaMascota = new ArrayList<>();
        System.out.println("Tamaño: " + listaMascota.size());
        listaMascota.add(mascota1);
        System.out.println("Tamaño: " + listaMascota.size());
        System.out.println();
        Mascota mascotaTest = listaMascota.get(0);
        System.out.println(mascotaTest.toString());
        
        System.out.println("Esta en la lista: " + listaMascota.contains(mascota1));
    }
}
