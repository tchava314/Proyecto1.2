public class Diccionario extends Lista<Lista<String>> {

	private Lista<Lista<String>> diccionario;

	public Diccionario() {

		creaDiccionario();

	}

	public void creaDiccionario() {

		for (int i = 65; i < 91; i++) {
			Lista<String> temp = new Lista<String>();
			diccionario.addDataEnd(temp.creaLista((char) i));
		}

	}

}
