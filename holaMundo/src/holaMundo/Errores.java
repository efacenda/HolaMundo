package holaMundo;

public class Errores {

	public static void main(String[] args) {

		int n = 2;
		if (n > 1) {
			for (int i = 1; i < 10; i++) {
				System.out.println("Número: " + i);
			}
		}
	}
}
/*
 * A pesar de estar corregidos los errores el programa sigue siendo inutil al
 * estar controlado el bucle por un if en el que no entraremos nunca, por lo que
 * lo modificaremos para que entre
 */

