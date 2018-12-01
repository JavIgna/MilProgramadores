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

    //Constructor
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
    
    public Nota getNota(int i){
        return this.notas.get(i);
    }

    public double promedioEstudiante() {
        double promedio = 0;
        for (int i = 0; i < this.notas.size(); i++) {
            promedio += notas.get(i).getNota();
        }
        promedio = (promedio / this.notas.size());
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
        return "Estudiante{" + "run=" + run + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
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
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.run, other.run)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        return true;
    }

}
