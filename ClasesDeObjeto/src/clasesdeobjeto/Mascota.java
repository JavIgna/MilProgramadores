package clasesdeobjeto;

public class Mascota {

//Atributos
    private String nombre;
    private char sexo;
    private int edad;
    private Persona duenio;

//Constructores
    public Mascota(String nombre, char sexo, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public Mascota(String nombre, char sexo, int edad, Persona duenio) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.duenio = duenio;
    }

//Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }
    
    @Override
    public String toString() {
        String resultado = "";
        resultado += "Nombre: " + this.nombre + "\n";
        resultado += "Sexo: " + this.sexo + "\n";
        resultado += "Edad: " + this.edad + "\n";
        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        boolean resultado = false;

        if (o instanceof Mascota) {
            Mascota x = (Mascota) o;
            if ((this.getNombre().equals(x.getNombre())) && (this.getSexo() == x.getSexo()) && (this.getEdad() == x.getEdad())) {
                resultado = true;
            }
        }
        return resultado;
    }

}
