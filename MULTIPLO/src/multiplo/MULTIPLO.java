package multiplo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MULTIPLO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String num1 = JOptionPane.showInputDialog("Escribe un número entero:");
        String num2 = JOptionPane.showInputDialog("Escribe otro número entero para saber si son multiplos:");
        int var1, var2;
        var1 = Integer.parseInt(num1);
        var2 = Integer.parseInt(num2);

        JOptionPane.showMessageDialog(null, (var1 % var2 == 0) ? "Si, son multiplos." : "No son multiplos.");

        /*
        if (var1 % var2 == 0) {
            JOptionPane.showMessageDialog(null, "Si, son multiplos.");
        } else {
            JOptionPane.showMessageDialog(null, "No son multiplos.");
        }
         */
    }
}
