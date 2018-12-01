package biblioteca;

import java.time.LocalDate;

public class Prestamo {

    private LocalDate fechaInicio;
    private LocalDate fechaTermino;
    private LocalDate fechaDevolucion;

    public Prestamo(LocalDate fechaInicio, LocalDate fechaTermino, LocalDate fechaDevolucion) {
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
        this.fechaDevolucion = fechaDevolucion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(LocalDate fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
