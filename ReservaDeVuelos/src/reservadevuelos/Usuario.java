package reservadevuelos;


public class Usuario{

    //Atributos
    private String correo;
    private String contrasenia;

    //Constructores
    public Usuario(String correo, String contrasenia) {
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    //Métodos
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
