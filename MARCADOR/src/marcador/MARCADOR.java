package marcador;

public class MARCADOR {

    public static void main(String[] args) {
        int digitos;
        String cadena;
        for (int i = 0; i < 1e5; i++) {
            cadena = "";
            digitos = (i + "").length();
            for (int j = 0; j < (5 - digitos); j++) {
                cadena += "0-";
            }
            for (int k = 0; k < digitos; k++) {
                if ((i + "").charAt(k) == '3') {
                    cadena += "E";
                } else {
                    cadena += (i + "").charAt(k);
                }
                if (k < digitos - 1) {
                    cadena += "-";
                }
            }
            System.out.println(cadena);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
            }
        }
    }

}
