public class Diccionario extends Lista<Lista<String>> {

	public Lista<Lista<String>> dic = new Lista<Lista<String>>();

	public Diccionario() {

		creaDiccionario();

	}

	private void creaDiccionario() {

		for (int i = 97; i < 123; i++) {

			Lista<String> temp = new Lista<String>();
			addDataEnd(temp.creaList(temp, (char) i));

		}

	}

	public String getPalabra(int x, int y) {

		String temp = getObject(x).getObject(y);

		return temp;
	}

}
