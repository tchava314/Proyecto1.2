public class Atril extends Tablero {

	private final int sizeX = 7, sizeY = 1;
	Tablero atril = new Tablero();

	public Atril() { // constructor
		super.newTab(sizeX, sizeY);

	}

	public Tablero repartirFichas(Lista<Ficha> bolsa) {
		for (int i = 0; i < 7; i++) {
			Ficha x = bolsa.EleAzar();
			Casilla cas = new Casilla(x);

			atril.getCas(i, 1).setFicha(x);

		}
		return atril;
	}

	public Casilla getFicha(int x, int y) {// metodo que devuelve una ficha en
											// la posicion x,y

		Casilla fichaXY = super.getCas(x, y);
		return fichaXY;
	}

	public void setFicha(Casilla newCas, int x, int y) {// metodo que le da
														// nuevos valores a una
														// ficha existente en la
														// posicion x,y,
		super.setCas(newCas, x, y);

	}
}
