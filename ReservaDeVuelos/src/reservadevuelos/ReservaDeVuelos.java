package reservadevuelos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ReservaDeVuelos {

    private final static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        int op = -1;
        int subOp = -1;
        do {
            op = menu();
            switch (op) {
                case 1:
                    if (validarUsuario()) {
                        flag:
                        do {
                            subOp = subMenu();
                            switch (subOp) {
                                case 1:
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    JOptionPane.showMessageDialog(null,
                                            "Regresando a Sistema Reserva de Vuelos");
                                    break flag;
                                default:
                                    JOptionPane.showMessageDialog(null,
                                            "La opción ingresada no es válida");
                            }
                        } while (subOp != 4);
                        break;
                    }
                        JOptionPane.showMessageDialog(null,
                                "Registrate para iniciar sesión.");

                case 2:
                    addUsuario(solicitarUsuario());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Adiós <3");
                    op = 3;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opción ingresada "
                            + "no es válida");
            }
        } while (op != 3);
    }

    private static int menu() {
        String opcion;
        opcion = JOptionPane.showInputDialog("::::... S.R.V. ...:::: \n"
                + "Sistema Reserva de Vuelos \n"
                + "1.- Iniciar Sesión.\n"
                + "2.- Registrarse.\n"
                + "3.- Salir.");
        int op = Integer.parseInt(opcion);
        return op;
    }

    private static int subMenu() {
        String opcion;
        opcion = JOptionPane.showInputDialog("::::... MENÚ ...:::: \n"
                + "1.- Consulta de Vuelos.\n"
                + "2.- Reserva de Vuelos.\n"
                + "3.- Compra de Billetes.\n"
                + "4.- Volver.");
        int subOp = Integer.parseInt(opcion);
        return subOp;
    }

    public static Usuario solicitarUsuario() {
        String correo = JOptionPane.showInputDialog("Ingrese el correo de "
                + "usuario:");
        String contrasenia = JOptionPane.showInputDialog("Crea una contraseña "
                + "de usuario:");
        String contrasenia2 = JOptionPane.showInputDialog("Reingresa la "
                + "contraseña de usuario:");
        do {
            if (!contrasenia.equals(contrasenia2)) {
                contrasenia = JOptionPane.showInputDialog("Crea una contraseña "
                        + "de usuario:");
                contrasenia2 = JOptionPane.showInputDialog("Reingresa la "
                        + "contraseña de usuario:");
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

    private static Usuario userEsta(String user) {

        boolean comprobar = false;
        Usuario aux = null;
        for (Usuario usr : usuarios) {
            //comprobar |= usr.equals(user); (es lo mismo que abajo)
            if (usr.getCorreo().equals(user)) {
                aux = usr;
                comprobar = true;
            }
        }
        return aux;
    }

    private static boolean validarUsuario() {
        String user = JOptionPane.showInputDialog("Bienvenido:\n"
                + "Ingresa tu usuario (correo electronico):");
        String contrasenia = JOptionPane.showInputDialog("Ingresa tu contraseña:");
        Usuario aux = userEsta(user);
        if (aux != null) {
            if (aux.getContrasenia().equals(contrasenia)) {
                JOptionPane.showMessageDialog(null, "Haz iniciado sesión.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Los datos ingresados no se "
                        + "encuentran en el sistema.\n"
                        + "Reintentalo");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encuentran los datos en "
                    + "nuestro sistema, por favor registrate.");
            return false;
        }
    }
}
