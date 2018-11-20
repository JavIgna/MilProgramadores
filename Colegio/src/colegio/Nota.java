package colegio;

import java.util.Objects;

public class Nota {
    //Atributos

    private double nota;
    private String asignatura;

    //Constructores
    public Nota(double nota, String asignatura) {
        this.nota = nota;
        this.asignatura = asignatura;
    }

    //Métodos
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado += "Nota: " + this.nota + "\n";
        resultado += "Asignatura: " + this.asignatura + "\n";
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
        final Nota other = (Nota) obj;
        if (Double.doubleToLongBits(this.nota) != Double.doubleToLongBits(other.nota)) {
            return false;
        }
        if (!Objects.equals(this.asignatura, other.asignatura)) {
            return false;
        }
        return true;
    }
    
    
}
