public class Diccionario extends Lista<Lista<Lista<String>>> {

	public Lista<Integer> ABC = new Lista<Integer>();
	public Lista<Lista<Lista<String>>> abc = new Lista<Lista<Lista<String>>>();

	public Diccionario() {

		creaDiccionario();

	}

	private void creaDiccionario() {

		for (int i = 65; i < 91; i++) {
			Lista<Lista<String>> temp2 = new Lista<Lista<String>>();

			for (int j = 65; j < 91; j++) {
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

		while (i < 26 && cond1) {

			letra = ABC.getObject(i);

			if (palabra.charAt(0) == (char) letra) {

				while (j < 26 && cond2) {
					int letra2 = ABC.getObject(j);

					if (palabra.charAt(1) == (char) letra2) {
						String palabraD = getPalabra(i, j, z);
						cond1 = false;
						cond2 = false;
						// System.out.println(palabraD);
						while (z < getObject(i).getObject(j).getSize()) {
							palabraD = getPalabra(i, j, z);
							// System.out.println(palabraD);
							if (palabraD.equals(palabra)) {
								return true;
							}
							z++;
						}
					}
					j++;
				}
			}
			i++;

		}

		return false;
	}

}