package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class Penalizacion {
    
    private static ArrayList<PenalizacionLector> penalizacionesLector = new ArrayList<>();
      
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Penalizacion(LocalDate fechaInicio, LocalDate fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
