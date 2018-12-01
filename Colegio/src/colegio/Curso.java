package colegio;

import java.util.ArrayList;
import java.util.Objects;

public class Curso {

    //Atributos
    private String codigo;
    private int nivel;
    private String tipo;

    //Relaciones
    private ArrayList<Estudiante> estudiantes;

    //Constructor
    public Curso(String codigo, int nivel, String tipo) {
        this.codigo = codigo;
        this.nivel = nivel;
        this.tipo = tipo;
        this.estudiantes = new ArrayList<>();
    }

    //Métodos
    public void addEstudiante(Estudiante est) {
        this.estudiantes.add(est);
    }

    public int sizeEstudiantes() {
        return this.estudiantes.size();
    }

    public void removeEstudiante(int index) {
        this.estudiantes.remove(index);
    }

    public void removeEstudiante(Estudiante est) {
        this.estudiantes.remove(est);
    }

    public boolean removeEstudiante(String run) {
        boolean is = false;
        for (int i = 0; i < this.estudiantes.size(); i++) {
            if (this.estudiantes.get(i).getRun().equals(run)) {
                is = true;
                this.estudiantes.remove(i);
                break;
            }
        }
        return is;
    }

    public void mostrarEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            estudiante.toString();
        }
    }

    public Estudiante searchEstudiante(int index) {
        return this.estudiantes.get(index);
    }

    public Estudiante searchEstudiante(String run) {
        for (int i = 0; i < this.estudiantes.size(); i++) {
            if (this.estudiantes.get(i).getRun().equals(run)) {
                return this.estudiantes.get(i);
            }
        }
        return null;
    }

    public double promedioGeneral() {
        double promedio = 0;
        for (int i = 0; i < this.estudiantes.size(); i++) {
            promedio += this.estudiantes.get(i).promedioEstudiante();
        }
        promedio = (promedio / this.estudiantes.size());
        return promedio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nivel=" + nivel + ", tipo=" + tipo + '}';
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
        final Curso other = (Curso) obj;
        if (this.nivel != other.nivel) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }

    boolean tieneEstudiantes() {
        return estudiantes.size()>0;
    }

}
