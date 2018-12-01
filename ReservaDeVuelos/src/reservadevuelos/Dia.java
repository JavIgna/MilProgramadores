package reservadevuelos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Dia {

    //Atributos
    private LocalDateTime horaFecha;

    //Relaciones
    private ArrayList<Vuelo> vueloLlegada = new ArrayList<>();
    private ArrayList<Vuelo> vueloSalida = new ArrayList<>();

    //Constructores
    public Dia(LocalDateTime horaFecha) {
        this.horaFecha = horaFecha;
    }

}
