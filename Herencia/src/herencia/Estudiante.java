package herencia;

public class Estudiante extends Persona {

    //Atributo
    private String correoInstitucional;

    //Constructor
    public Estudiante(String rut, String nombre, String apellido) {
        super(rut, nombre, apellido);
    }

    //Métodos
    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
}
