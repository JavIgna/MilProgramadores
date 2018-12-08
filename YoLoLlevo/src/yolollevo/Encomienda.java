/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yolollevo;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author guillermofuentesquijada
 */
public class Encomienda {
    private String identificador;
    private Cliente remitente;
    private Cliente destinatario;
    private Oficina origen;
    private Oficina destino;
    
    private ArrayList<Paquete> paquetes;

    public Encomienda(String identificador, Cliente remitente, Cliente destinatario, Oficina origen, Oficina destino) {
        this.identificador = identificador;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.origen = origen;
        this.destino = destino;
        this.paquetes = new ArrayList<>();
    }
    
    public void agregarPaquete(Paquete paquete){
        this.paquetes.add(paquete);
    }

    public int cantPaquetes(){
        return this.paquetes.size();
    }
    
    public Paquete obtenerPaquete(int i){
        return this.paquetes.get(i);
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    public Cliente getRemitente() {
        return remitente;
    }

    public void setRemitente(Cliente remitente) {
        this.remitente = remitente;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Cliente destinatario) {
        this.destinatario = destinatario;
    }

    public Oficina getOrigen() {
        return origen;
    }

    public void setOrigen(Oficina origen) {
        this.origen = origen;
    }

    public Oficina getDestino() {
        return destino;
    }

    public void setDestino(Oficina destino) {
        this.destino = destino;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
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
        final Encomienda other = (Encomienda) obj;
        if (!Objects.equals(this.remitente, other.remitente)) {
            return false;
        }
        if (!Objects.equals(this.destinatario, other.destinatario)) {
            return false;
        }
        if (!Objects.equals(this.origen, other.origen)) {
            return false;
        }
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Encomienda{" + "remitente=" + remitente + ", destinatario=" + destinatario + ", origen=" + origen + ", destino=" + destino + ", paquetes=" + paquetes + '}';
    }
    
}
