public class JuegoUtils {
	static int primero, segundo, tercero, cuarto;

	public static int turnoSalida(char fichajug) {// metodo que recibe una
													// ficha y le da un
													// valor de acuerdo a
													// que tan cercana a la
													// letra A este

		final String ABCD = "*ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int tam = ABCD.length();
		for (int i = 0; 1 < tam; i++) {
			if (fichajug == ABCD.charAt(i)) {
				return i;
			} else {

			}
		}
		return -1;
	}

	public static String ganadorrifa2(char jug1, char jug2) {
		if ((turnoSalida(jug1) > turnoSalida(jug2))) {

			return "el jugador 2 gano la rifa";
		}
		return "el jugador 1 gano la rifa";

	}

}
