package reservadevuelos;

import java.util.ArrayList;

public class Pasajero {

    //Atributos
    private String nombre;
    private String direccion;
    private String ciudad;
    private String pais;
    private String codigoPostal;
    private String fonoCasa;
    private String fonoOficina;
    private String fax;
    private String email;

    //Relaciones
    private ArrayList<Tarjeta> tarjetas = new ArrayList<>();
    private ArrayList<Reserva> reservas = new ArrayList<>();

    //Constructores
    public Pasajero(String nombre, String direccion, String ciudad, String pais, String codigoPostal, String fonoCasa, String fonoOficina, String fax, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
        this.fonoCasa = fonoCasa;
        this.fonoOficina = fonoOficina;
        this.fax = fax;
        this.email = email;
    }
    
    //Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getFonoCasa() {
        return fonoCasa;
    }

    public void setFonoCasa(String fonoCasa) {
        this.fonoCasa = fonoCasa;
    }

    public String getFonoOficina() {
        return fonoOficina;
    }

    public void setFonoOficina(String fonoOficina) {
        this.fonoOficina = fonoOficina;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }            
}
