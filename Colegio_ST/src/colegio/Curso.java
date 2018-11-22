package colegio;

import java.util.ArrayList;
import java.util.Objects;

public class Curso {

    //Atributos
    private String codigo;
    private String nivel;
    private String tipo;

    //Relaciones
    private ArrayList<Estudiante> estudiantes;

    //Constructores
    public Curso(String codigo, String nivel, String tipo) {
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
        promedio = promedio / this.estudiantes.size();
        return promedio;
    }

public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

//    public int consultarPromedioGral(int sumaNotasAlumnos, int cantAlumnos) {
//        int prom = sumaNotasAlumnos / cantAlumnos;
//        return prom;
//    }
    @Override
        public String toString() {
        String resultado = "";
        resultado += "Codigo: " + this.codigo + "\n";
        resultado += "Nivel: " + this.nivel + "\n";
        resultado += "Tipo: " + this.tipo + "\n";
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
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nivel, other.nivel)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }

}
