public class Diccionario extends Lista<Lista<Lista<String>>> {

	public Lista<Integer> ABC = new Lista<Integer>();
	public Lista<Lista<Lista<String>>> abc = new Lista<Lista<Lista<String>>>();

	public Diccionario() {

		creaDiccionario();

	}

	private void creaDiccionario() {

		for (int i = 97; i < 123; i++) {
			Lista<Lista<String>> temp2 = new Lista<Lista<String>>();

			for (int j = 97; j < 123; j++) {
				Lista<String> temp = new Lista<String>();
				temp2.addDataEnd(temp.creaList(temp, (char) i, (char) j));

			}

			ABC.addDataEnd(i);
			addDataEnd(temp2);
		}

	}

	public String getPalabra(int x, int y, int z) {

		Lista<String> temp1 = getObject(x).getObject(y);

		if (temp1.getSize() == 0) {
			return null;
		}

		String temp = getObject(x).getObject(y).getObject(z);

		return temp;
	}

	public boolean isDicc(String palabra) {

		int i = 0, j = 0, z = 0;
		int letra = ABC.getObject(i);
		boolean cond1 = true, cond2 = true;

		while (i < 25 && cond1) {

			letra = ABC.getObject(i);

			if (palabra.charAt(0) == (char) letra) {

				int letra2 = ABC.getObject(j);

				while (j < 25 && cond2) {
					letra2 = ABC.getObject(j);

					if (palabra.charAt(1) == (char) letra2) {
						String palabraD = getPalabra(i, j, z);
						cond1 = false;
						cond2 = false;
						while (palabraD != null) {
							palabraD = getPalabra(i, j, z);
							if (palabraD.equals(palabra)) {
								return true;
							}

							z++;

						}

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
