/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telollevo;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author guillermofuentesquijada
 */
public class Paquete {
    private String identificador;
    private String descripcion;
    private LocalDate fechaenvio;
    private Double peso;
    private Integer costo;
    
    private Encomienda encomienda;

    public Paquete(String identificador, String descripcion, LocalDate fechaenvio, Double peso, Integer costo) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.fechaenvio = fechaenvio;
        this.peso = peso;
        this.costo = costo;
    }

    public Encomienda getEncomienda() {
        return encomienda;
    }

    public void setEncomienda(Encomienda encomienda) {
        this.encomienda = encomienda;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getDescricion() {
        return descripcion;
    }

    public void setDescricion(String descricion) {
        this.descripcion = descricion;
    }

    public LocalDate getFechaenvio() {
        return fechaenvio;
    }

    public void setFechaenvio(LocalDate fechaenvio) {
        this.fechaenvio = fechaenvio;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
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
        final Paquete other = (Paquete) obj;
        if (!Objects.equals(this.identificador, other.identificador)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.fechaenvio, other.fechaenvio)) {
            return false;
        }
        if (!Objects.equals(this.peso, other.peso)) {
            return false;
        }
        if (!Objects.equals(this.costo, other.costo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paquete{" + "identificador=" + identificador + ", descricion=" + descripcion + ", fechaenvio=" + fechaenvio + ", peso=" + peso + ", costo=" + costo + '}';
    }
    
    
}
