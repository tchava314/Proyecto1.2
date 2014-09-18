public class Diccionario extends Lista<Lista<String>> {

	public Lista<Integer> ABC = new Lista<Integer>();;

	public Diccionario() {

		creaDiccionario();

	}

	private void creaDiccionario() {

		for (int i = 97; i < 123; i++) {

			Lista<String> temp = new Lista<String>();
			addDataEnd(temp.creaList(temp, (char) i));
			ABC.addDataEnd(i);
		}

	}

	public String getPalabra(int x, int y) {

		String temp = getObject(x).getObject(y);

		return temp;
	}

	public boolean isDicc(String palabra) {

		int i = 0, j = 0;
		int letra = ABC.getObject(i);
		while (i < 25) {
			letra = ABC.getObject(i);

			if (palabra.charAt(0) == (char) letra) {
				String palabraD = getPalabra(i, j);
				while (palabraD != null) {
					palabraD = getPalabra(i, j);

					if (palabraD == palabra) {
						return true;
					} else {
						j++;
					}

				}
			} else {
				i++;
			}

		}

		return false;
	}

}
