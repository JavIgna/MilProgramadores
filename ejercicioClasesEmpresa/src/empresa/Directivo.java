package empresa;

import java.util.ArrayList;

public class Directivo extends Empleado {

    //Atributos
    private char categoria;

    //Relaciones
    ArrayList<Empleado> subordinados = new ArrayList<>();

    //Constructores
    public Directivo(char categoría, int sueldo, String nombre, int edad) {
        super(sueldo, nombre, edad);
        this.categoria = categoría;
    }

    //Métodos
    public char getCategoría() {
        return categoria;
    }

    public void setCategoría(char categoría) {
        this.categoria = categoría;
    }

    public ArrayList<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
    }

    @Override
    public String toString() {
        return "Directivo{" + "categoría=" + categoria + ", subordinados=" + subordinados + '}';
    }
}
