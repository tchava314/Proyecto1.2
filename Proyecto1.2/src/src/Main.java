public class Main {

	public static void main(String arg[]) {

		// Diccionario dic = new Diccionario();

		Lista<Lista<String>> dic = new Lista<Lista<String>>();
		Lista<String> lista = new Lista<String>();

		Lista<String> letraA;

		lista.addDataBegin("Hola");

		for (int i = 65; i < 91; i++) {

			dic.addDataEnd(new Lista<String>());
			// System.out.println(""+(char)i);
		}

		// dic.getObject(0).creaLista((char) 99);
		letraA = dic.getObject(1);

		letraA = letraA.creaLista((char) 98);

		Tablero tablero = new Tablero();
		// tablero.setCas(new Casilla("g",4), 5, 5);
		tablero.setCas(new Casilla(new Ficha(0, null)), 0, 0);
		Casilla algo = tablero.getCas(5, 5);

		System.out.print("" + (char) 98);

		System.out.println("" + letraA.getSize());

	}

}
