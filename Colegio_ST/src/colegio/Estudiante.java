package colegio;

import java.util.ArrayList;
import java.util.Objects;

public class Estudiante {
    //Atributos

    private String run;
    private String nombre;
    private String apellidos;
    private int edad;

    //Relaciones
    private ArrayList<Nota> notas;

    //Constructores
    public Estudiante(String run, String nombre, String apellidos, int edad) {
        this.run = run;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.notas = new ArrayList<>();
    }

    //Métodos
    public void addNota(Nota nota) {
        this.notas.add(nota);
    }
    
     public int sizeNota() {
        return this.notas.size();
    }
     
    public double promedioEstudiante() {
        double promedio = 0;
        for (int i = 0; i < this.notas.size(); i++) {
            promedio += notas.get(i).getNota();
        }
        promedio = promedio / this.notas.size();
        return promedio;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
        resultado += "RUN: " + this.run + "\n";
        resultado += "Nombre: " + this.nombre + "\n";
        resultado += "Apellido: " + this.apellidos + "\n";
        resultado += "Edad: " + this.edad + "\n";
        return resultado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiante other = (Estudiante) obj;
        if (!Objects.equals(this.run, other.run)) {
            return false;
        }
        return true;
    }

}
