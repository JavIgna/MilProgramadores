package biblioteca;

public class Empleado extends Lector {
    private String idEmpleado;

    public Empleado(String idEmpleado, String nombre, String direccionPostal, String dni) {
        super(nombre, direccionPostal, dni);
        this.idEmpleado = idEmpleado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}