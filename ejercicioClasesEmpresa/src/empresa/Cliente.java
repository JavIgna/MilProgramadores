package empresa;

public class Cliente extends Persona {
    
    //Atributos
    private int numContacto;
    
    //Constructores
    public Cliente(int numContacto, String nombre, int edad) {
        super(nombre, edad);
        this.numContacto = numContacto;
    }
    
    //Métodos
    public int getNumContacto() {
        return numContacto;
    }

    public void setNumContacto(int numContacto) {
        this.numContacto = numContacto;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numContacto=" + numContacto + '}';
    } 
}
