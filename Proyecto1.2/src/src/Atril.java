public class Atril extends Lista<Ficha> {

	private Bolsa bolsa;
	Lista<Ficha> atril = new Lista<Ficha>();

	public Atril(Bolsa bolsa) { // constructor
		this.bolsa = bolsa;
		this.repartirFichas(bolsa);
	}

	public void repartirFichas(Bolsa bolsa) {
		for (int i = 0; i < 7; i++) {
			Ficha x = bolsa.EleAzar();

			atril.addDataEnd(x);
			;

		}

	}

	public Ficha getFicha(int x) {// metodo que devuelve una ficha en
									// la posicion x,y

		Ficha fichaXY = atril.getObject(x);
		return fichaXY;
	}

	public void setFicha(int x) {// metodo que le da
									// nuevos valores a una
		atril.getObject(x).borraLetra();
		// ficha existente en la // posicion x,y

	}
}
