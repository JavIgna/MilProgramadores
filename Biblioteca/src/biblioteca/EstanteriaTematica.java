package biblioteca;

public class EstanteriaTematica {

    private Estanteria estanteria;
    private Tematica tematica;

    public EstanteriaTematica(Estanteria estanteria, Tematica tematica) {
        this.estanteria = estanteria;
        this.tematica = tematica;
    }

    public Estanteria getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(Estanteria estanteria) {
        this.estanteria = estanteria;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }
}
