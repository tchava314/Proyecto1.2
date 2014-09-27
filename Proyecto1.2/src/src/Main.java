public class Main {
	public static void main(String arg[]) {

		Lista<Ficha> bolsa = new Fichas().crearFichas();
		Tablero atril1 = new Atril().repartirFichas(bolsa);
		Tablero atril2 = new Atril().repartirFichas(bolsa);
		for (int i = 0; i < 7; i++) {
			System.out.println(atril1.getCas(i, 1).getFicha().getLetra()
					+ " atril1");
			System.out.println(atril2.getCas(i, 1).getFicha().getLetra()
					+ " atril2");
		}
	}
}