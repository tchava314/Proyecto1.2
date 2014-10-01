import java.io.BufferedReader;
import java.io.FileReader;

public class Readtxt {

	private static BufferedReader br;
	static String dic;

	public void creaLista(Lista<String> lista, char x, char y) {

		try {
			FileReader fr = new FileReader("src//src//es_CR.dic");
			br = new BufferedReader(fr);

			dic = br.readLine();

			while (dic != null) {
				dic = br.readLine();
				String[] word = dic.split("/");
				System.out.println(word[0].charAt(1));
				if (word[0].charAt(0) == x) {

					if (word[0].charAt(1) == y) {
						lista.addDataEnd(word[0]);
						System.out.println(word[0]);
					}

				}

			}

		} catch (Exception ex) {
			System.out.println("conejo");

		}

	}

}
