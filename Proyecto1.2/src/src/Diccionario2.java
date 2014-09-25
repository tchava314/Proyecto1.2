public class Diccionario2 extends Lista<Lista<String>> {

	public Lista<Integer> ABC = new Lista<Integer>();
	public Lista<Lista<String>> abc = new Lista<Lista<String>>();

	public Diccionario2() {

		creaDiccionario();

	}

	private void creaDiccionario() {

		for (int i = 97; i < 123; i++) {

			Lista<String> temp = new Lista<String>();
			addDataEnd(temp.creaList2(temp, (char) i));

			addDataEnd(temp);
		}

	}

	public String getPalabra(int x, int y) {

		Lista<String> temp1 = getObject(x);

		if (temp1.getSize() == 0) {
			return null;
		}

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
				i = 26;
				while (palabraD != null) {
					palabraD = getPalabra(i, j);
					if (palabraD == palabra) {
						return true;
					}

				}
			}
		}
		return false;
	}

}
