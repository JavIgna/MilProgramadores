package herencia;

import java.util.ArrayList;

public class Herencia {

    public static void main(String[] args) {
        String rut = "3871265361723-K";
        String nombre = "Peter";
        String apellido = "Piterson";
        String correo = "hola@chao.cl";
                                
        Estudiante estudiante = new Estudiante(rut, nombre, apellido);
        
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(estudiante); //Se puede agregar un heredero de la clase.
    }

}
