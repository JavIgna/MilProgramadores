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
public class Ciudad {
    
    private String identificador;
    private String nombre;
    private Integer numero;
    
    private ArrayList<Oficina> oficinas;

    public Ciudad(String identificador, String nombre, Integer numero) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.numero = numero;
        this.oficinas = new ArrayList<>();
    }
    
    public void agregarOficina(Oficina oficina){
        oficinas.add(oficina);
    }
    
    public int cantOficinas(){
        return oficinas.size();
    }
    
    public Oficina obtenerOficina(int i){
        return oficinas.get(i);
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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
        final Ciudad other = (Ciudad) obj;
        if (!Objects.equals(this.identificador, other.identificador)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "identificador=" + identificador + ", nombre=" + nombre + ", numero=" + numero + ", oficinas=" + oficinas + '}';
    }
    
}
