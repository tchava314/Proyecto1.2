public class JuegoUtils {

	public static int turnoSalida(Ficha fichajug) {// metodo que recibe una
													// ficha y le da un
													// valor de acuerdo a
													// que tan cercana a la
													// letra A este

		final String ABCD = "*ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int tam = ABCD.length();
		for (int i = 0; 1 < tam; i++) {
			if (fichajug.getLetra() == ABCD.charAt(i)) {
				return i;
			} else {

			}
		}
		return -1;
	}
}
