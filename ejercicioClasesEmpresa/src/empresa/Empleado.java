package empresa;

public class Empleado extends Persona {

    //Atributos
    private int sueldo;

    //Constructores
    public Empleado(int sueldo, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    //Métodos
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "sueldo=" + sueldo + '}';
    }
}
