public class Atril extends Tablero {

	private final int sizeX = 1, sizeY = 7;

	public Atril() { // constructor
		super.newTab(sizeX, sizeY);
	}

	public Casilla getFicha(int x, int y) {// metodo que devuelve una ficha en
											// la posicion x,y

		Casilla fichaXY = super.getCas(x, y);
		return fichaXY;
	}

	public void setFicha(Casilla newCas, int x, int y) {// metodo que le da
														// nuevos valores a una
														// ficha existente en la
														// posicion x,y
		super.setCas(newCas, x, y);

	}
}
