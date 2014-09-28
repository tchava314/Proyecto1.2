public class Tablero extends Lista<Lista<Casilla>> {
	private final int sizeX = 15, sizeY = 15;
	private Diccionario dicc;
	public Lista<Lista<Casilla>> TAB = new Lista<Lista<Casilla>>();

	public Tablero(Diccionario dicc) {

		newTab(sizeX, sizeY);
		this.dicc = dicc;
	}

	public Tablero() {

		newTab(sizeX, sizeY);

	}

	public void newTab(int x, int y) {

		for (int i = 0; i < x; i++) {

			TAB.addDataEnd(new Lista<Casilla>());
			for (int j = 0; j < y; j++) {
				TAB.getObject(i).addDataEnd(new Casilla(new Ficha(0, null)));
			}
		}
	}

	public Casilla getCas(int x, int y) {

		Casilla casXY = TAB.getObject(x).getObject(y);
		return casXY;
	}

	public void setCas(Casilla newCas, int x, int y) {
		Casilla oldCas = getCas(x, y);
		oldCas = newCas;
	}

	public boolean leer(String fc, int filaocol) { /*
													 * esta funcion lee una fila
													 * o columna y devuelve
													 * false si encuentra una
													 * palabra que no está en el
													 * diccionario, de lo
													 * contrario devuelve true
													 */
		// variables
		// boolean vacio=true;
		String lectura = "";
		int posCasilla = 0, largoLectura = 0;
		String letra;
		if (fc == "f") { // revisa una fila
			while (posCasilla < 14) {
				for (int i = posCasilla; i < 15; i++) {// quita las casillas
														// vacias
					letra = this.getCas(i, filaocol).getFicha().getLetra();
					posCasilla = i;
					if (letra != null) {
						// vacio=false;
						break;
					}
				}
				for (int i = posCasilla; i < 15; i++) { // lee las letras que
														// estan juntas
					letra = this.getCas(i, filaocol).getFicha().getLetra();
					posCasilla = i;
					if (letra != null) {
						lectura = lectura + letra;
						largoLectura++;
					} else
						break;
				}
				if (largoLectura > 1) { // revisa que la palabra este en el
										// diccionario
					System.out.println("yeryis");
					System.out.println("");
					System.out.println(lectura);
					System.out.println("");
					if (!dicc.isDicc(lectura)) { // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
						System.out.println("yeryis");
						return false;
					}
					lectura = "";
				}
			}
			return true;
		} else { // revisa una columna
			while (posCasilla < 14) {
				for (int i = posCasilla; i < 15; i++) { // quita las casillas
														// vacias
					letra = this.getCas(filaocol, i).getFicha().getLetra();
					posCasilla = i;
					if (letra != null) {
						// vacio=false;
						break;
					}
				}
				for (int i = posCasilla; i < 15; i++) { // lee las letras que
														// estan juntas
					letra = this.getCas(filaocol, i).getFicha().getLetra();
					posCasilla = i;
					if (letra != null) {
						lectura = lectura + letra;
					} else
						break;
				}
				if (!lectura.equals("")) { // revisa que la palabra este en el
											// diccionario
					if (!dicc.isDicc(lectura)) { // /!!!!!!!!!!!!!!!!!!!!!!!//
						return false;
					}
					lectura = "";
				}
			}
			return true;
		}
	}
}