package reservavuelo;

import java.util.Date;
import javax.swing.JOptionPane;

public class ReservaVuelo {

    public static void main(String[] args) {
        int op = 4;
        do {
            op = menu();
            switch (op) {
                case 1:
                    break;

                case 2:
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Adiós <3");
                    break;
                default:
                    break;

            }
        } while (op != 3);

    }

    public static int menu() {
        int op = -1;
        String opcion = "";
        opcion = JOptionPane.showInputDialog("::.. Bienvenido a Servicio de Reserva ..::\n"
                + "1. - Iniciar Sesión \n" + "2.- Registrarse\n" + "3.- Salir");
        op = Integer.parseInt(opcion);
        return op;
    }
}
