package cachipun;

import java.util.Scanner;

public class CACHIPUN {

	static final int PIEDRA = 1;
	static final int PAPEL = 2;
	static final int TIJERA = 3;

	public static void main(String[] args) {
		System.out.println("Desafio Cachipun");

		int ptje_pl, ptje_cpu;
		ptje_pl = 0;
		ptje_cpu = 0;

		do {

			System.out.println("Ingresa 1 si quieres jugar piedra, ingresa 2 si quieres jugar papel y 3 si quieres jugar tijera");
			Scanner leer = new Scanner(System.in);
			int num = leer.nextInt();
			int num_pc = (int) (Math.random() * 3 + 1);

			if (num == num_pc) {
				if (num == PIEDRA) {
					System.out.println("Ambos jugaron piedra!");
					System.out.println("EMPATE");
					System.out.println("Puntaje JUGADOR: " + ptje_pl +" Puntaje CPU: " + ptje_cpu);
					System.out.println("");
				}
				if (num == PAPEL) {
					System.out.println("Ambos jugaron papel!");
					System.out.println("EMPATE");
					System.out.println("Puntaje JUGADOR: " + ptje_pl +" Puntaje CPU: " + ptje_cpu);
					System.out.println("");
					if (num == TIJERA) {
						System.out.println("Ambos jugaron tijera!");
						System.out.println("EMPATE");
						System.out.println("Puntaje JUGADOR: " + ptje_pl +" Puntaje CPU: " + ptje_cpu);
						System.out.println("");
					}
				}
			}

			if (num == PIEDRA & num_pc == TIJERA) {
				ptje_pl = ptje_pl + 1;
				System.out.println("Juegas piedra y CPU tijera!");
				System.out.println("GANAS ESTA RONDA");
				System.out.println("Puntaje JUGADOR: " + ptje_pl +" Puntaje CPU: " + ptje_cpu);
				System.out.println("");
			}
			if (num == PAPEL & num_pc == PIEDRA) {
				ptje_pl = ptje_pl + 1;
				System.out.println("Juegas papel y CPU piedra!");
				System.out.println("GANAS ESTA RONDA");
				System.out.println("Puntaje JUGADOR: " + ptje_pl +" Puntaje CPU: " + ptje_cpu);
				System.out.println("");
			}
			if (num == TIJERA & num_pc == PAPEL) {
				ptje_pl = ptje_pl + 1;
				System.out.println("Juegas tijera y CPU papel!");
				System.out.println("GANAS ESTA RONDA");
				System.out.println("Puntaje JUGADOR: " + ptje_pl +" Puntaje CPU: " + ptje_cpu);
				System.out.println("");
			}
			if (num == TIJERA & num_pc == PIEDRA) {
				ptje_cpu = ptje_cpu + 1;
				System.out.println("Juegas tijera y CPU piedra!");
				System.out.println("PIERDES ESTA RONDA");
				System.out.println("Puntaje JUGADOR: " + ptje_pl +" Puntaje CPU: " + ptje_cpu);
				System.out.println("");
			}
			if (num == PIEDRA & num_pc == PAPEL) {
				ptje_cpu = ptje_cpu + 1;
				System.out.println("Juegas piedra y CPU papel!");
				System.out.println("PIERDES ESTA RONDA");
				System.out.println("Puntaje JUGADOR: " + ptje_pl +" Puntaje CPU: " + ptje_cpu);
				System.out.println("");
			}
			if (num == PAPEL & num_pc == TIJERA) {
				ptje_cpu = ptje_cpu + 1;
				System.out.println("Juegas papel y CPU tijera!");
				System.out.println("PIERDES ESTA RONDA");
				System.out.println("Puntaje JUGADOR: " + ptje_pl +" Puntaje CPU: " + ptje_cpu);
				System.out.println("");
			}
		} while (!(ptje_pl == 3 || ptje_cpu == 3));

		if (ptje_pl == 3) {
			System.out.println("GANASTE, FELICITACIONES!!!");
		} else {
			System.out.println("PERDISTE, MEJOR SUERTE PARA LA PROXIMA!");
		}
	}
}
