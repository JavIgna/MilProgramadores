package tiendafotografia;

import java.time.LocalDate;

class Multa {

    private LocalDate fechaInicio;
    private LocalDate fechaTermino;

    public Multa(LocalDate fechaInicio, LocalDate fechaTermino) {
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaTermino() {
        return fechaTermino;
    }

    @Override
    public String toString() {
        return "Multa{" + "fechaInicio=" + fechaInicio + ", fechaTermino=" + fechaTermino + '}';
    }
}
