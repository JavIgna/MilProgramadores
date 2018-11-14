package javaapplication1;

import javax.swing.JOptionPane;

public class JavaApplication1 {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Introduzca su nombre");

        JOptionPane.showMessageDialog(null, "Hola " +name);
    }
}
