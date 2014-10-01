public class Fichas extends Lista {
	Lista<Ficha> bolsa = new Lista<Ficha>();

	public Lista<Ficha> crearFichas() {
		for (int i = 1; i <= 2; i++) {
			bolsa.addDataEnd(new Ficha(0, "*"));
			bolsa.addDataEnd(new Ficha(3, "B"));
			bolsa.addDataEnd(new Ficha(3, "C"));
			bolsa.addDataEnd(new Ficha(3, "M"));
			bolsa.addDataEnd(new Ficha(3, "P"));
			bolsa.addDataEnd(new Ficha(4, "F"));
			bolsa.addDataEnd(new Ficha(4, "H"));
			bolsa.addDataEnd(new Ficha(4, "V"));
			bolsa.addDataEnd(new Ficha(4, "W"));
			bolsa.addDataEnd(new Ficha(4, "Y"));
		}// fin for 2
		for (int i = 1; i <= 12; i++) {
			bolsa.addDataEnd(new Ficha(1, "E"));
		}// fin for 12
		for (int i = 1; i <= 9; i++) {
			bolsa.addDataEnd(new Ficha(1, "A"));
			bolsa.addDataEnd(new Ficha(1, "I"));

		}// fin for 9
		for (int i = 1; i <= 4; i++) {
			bolsa.addDataEnd(new Ficha(1, "I"));
			bolsa.addDataEnd(new Ficha(1, "S"));
			bolsa.addDataEnd(new Ficha(1, "U"));
			bolsa.addDataEnd(new Ficha(2, "D"));

		}// fin for 4
		for (int i = 1; i <= 8; i++) {
			bolsa.addDataEnd(new Ficha(1, "O"));
		}// fin for 8
		for (int i = 1; i <= 6; i++) {
			bolsa.addDataEnd(new Ficha(1, "N"));
			bolsa.addDataEnd(new Ficha(1, "R"));
			bolsa.addDataEnd(new Ficha(1, "T"));

		}// fin for 6
		for (int i = 1; i <= 3; i++) {
			bolsa.addDataEnd(new Ficha(2, "G"));
		}// fin for 3
		bolsa.addDataEnd(new Ficha(5, "K"));
		bolsa.addDataEnd(new Ficha(8, "J"));
		bolsa.addDataEnd(new Ficha(8, "X"));
		bolsa.addDataEnd(new Ficha(10, "Q"));
		bolsa.addDataEnd(new Ficha(10, "Z"));
		return bolsa;
	}// fin metodo crearfichas

}// fin de la clase