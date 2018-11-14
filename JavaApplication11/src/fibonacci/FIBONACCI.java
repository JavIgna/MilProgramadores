package fibonacci;

public class FIBONACCI {

	public static void main(String[] args) {
		int[][] matrix = new int[6][6];
		int cont = 1;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int anotar = fibonacci(cont);
				matrix[i][j] = anotar;
				cont++;
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("[" + matrix[i][j] + "]");
			}
			System.out.println("");
		}
	}

	public static int fibonacci(int num) {
		int fib;

		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
			fib = fibonacci(num - 1) + fibonacci(num - 2);
			return fib;
		}
	}
}
