
package tiendafotografia;

import java.util.ArrayList;

public class ServicioTecnico {
    
    ArrayList<Marca> marcas = new ArrayList<>();
    
    private String direccion;

    public ServicioTecnico(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "ServicioTecnico{" + "direccion=" + direccion + '}';
    }
}
