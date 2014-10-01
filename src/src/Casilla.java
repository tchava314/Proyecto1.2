public class Casilla {
	private Ficha ficha;
	private String bonus;

	public Casilla(Ficha ficha) { // Contructor casilla atril
		this.ficha = ficha;

	}

	public Casilla(Ficha ficha, String bonus) { // constructor casilla tablero
		this.ficha = ficha;
		this.bonus = bonus;
	}

	public Ficha getFicha() { // devuelve el valor de la variable ficha
		return ficha;
	}

	public String getBonus() {// metodo que devuelve el valor de ña variable
								// bonus
		return bonus;
	}

	public void setFicha(Ficha newFicha) { // metodo que le asigana una letra a
											// la
											// casilla
		this.ficha = newFicha;
	}

	public void setBonus(String bonus, Ficha ficha) {// metodo que reasigna un
														// valor en
		// puntos a la casilla de acuerdo con el
		// bonus extra que tenga
		if (bonus == "2L") {
			// ficha.getValor() = 2 * ficha.getValor();
		}
		if (bonus == "3L") {
			// ficha.getValor() = 3 * ficha.getValor();
		}
		if (bonus == "2P") {

		}
		if (bonus == "3P") {

		}

	}
}