package reservadevuelos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReservaDeVuelos {

    private final static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        int op = 4;
        do {
            op = menu();
            switch (op) {
                case 1:
                    break;
                case 2:
                    addUsuario(solicitarUsuario());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Adiós <3");
                    op = 3;
                    break;
                default:
            }
        } while (op != 3);
    }

    private static int menu() {
        String opcion;
        opcion = JOptionPane.showInputDialog("::::... MENÚ ...:::: \n"
                + "1.- Iniciar Sesión.\n"
                + "2.- Registrarse.\n"
                + "3.- Salir.");
        int op = Integer.parseInt(opcion);
        return op;
    }

    public static Usuario solicitarUsuario() {
        String correo = JOptionPane.showInputDialog("Ingrese el correo de usuario:");
        String contrasenia = JOptionPane.showInputDialog("Crea una contraseña de usuario:");
        String contrasenia2 = JOptionPane.showInputDialog("Reingresa la contraseña de usuario:");
        do {
            if (!contrasenia.equals(contrasenia2)) {
                contrasenia = JOptionPane.showInputDialog("Crea una contraseña de usuario:");
                contrasenia2 = JOptionPane.showInputDialog("Reingresa la contraseña de usuario:");
            }

            if (contrasenia.equals(contrasenia2)) {
                JOptionPane.showMessageDialog(null, "Las contraseñas coinciden...\n"
                        + "el usuario a sido creado exitosamente");
            }
        } while (!contrasenia.equals(contrasenia2));
        Usuario user = new Usuario(correo, contrasenia);
        return user;
    }

    public static void addUsuario(Usuario user) {
        usuarios.add(user);
    }

    public static int sizeUsuarios() {
        return usuarios.size();
    }

}
