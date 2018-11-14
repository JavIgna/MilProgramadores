package ejercicio_muestra_suma_en_matriz;

public class EJERCICIO_MUESTRA_SUMA_EN_MATRIZ {

	public static void main(String[] args) {
		int suma;
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= 0; j--) {
				suma = (i*10+j);
				System.out.println(suma);
			}
		}
	}
}
