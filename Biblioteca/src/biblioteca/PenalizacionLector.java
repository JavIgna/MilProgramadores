
package biblioteca;

import java.time.LocalDate;

public class PenalizacionLector {
    private Penalizacion penalizacion;
    private Lector lector;
    private LocalDate fecha;

    public PenalizacionLector(Penalizacion penalizacion, Lector lector, LocalDate fecha) {
        this.penalizacion = penalizacion;
        this.lector = lector;
        this.fecha = fecha;
    }

    public Penalizacion getPenalizacion() {
        return penalizacion;
    }

    public void setPenalizacion(Penalizacion penalizacion) {
        this.penalizacion = penalizacion;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    } 
}
