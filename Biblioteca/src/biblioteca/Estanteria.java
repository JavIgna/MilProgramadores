package biblioteca;

public class Estanteria {

    private static final int LIMITE = 100;
    private int idEstant;

    public Estanteria(int idEstant) {
        this.idEstant = idEstant;
    }

    public int getIdEstant() {
        return idEstant;
    }

    public void setIdEstant(int idEstant) {
        this.idEstant = idEstant;
    }
}
