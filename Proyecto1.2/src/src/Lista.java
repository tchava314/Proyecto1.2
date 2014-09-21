import java.io.BufferedReader;
import java.io.FileReader;

public class Lista<Ele> {

	private static BufferedReader br;
	Nodo<Ele> head;
	protected int size;

	public Lista() {
		head = null;
		size = 0;
	}

	public Ele getObject(int pos) {
		int count = 0;
		Nodo<Ele> temp = head;

		while (count < pos) {
			temp = temp.getNext();
			count++;
		}
		return temp.getData();
	}

	public void addDataBegin(Ele newObject) {

		if (head == null) {
			head = new Nodo<Ele>(newObject);
		}

		else {
			Nodo<Ele> temp = head;
			Nodo<Ele> newNode = new Nodo<Ele>(newObject);
			newNode.setNext(temp);
			head = newNode;
			size++;
		}

	}

	public void addDataEnd(Ele newObject) {

		if (head == null) {
			head = new Nodo<Ele>(newObject);
		}

		else {
			Nodo<Ele> temp = head;
			Nodo<Ele> newNode = new Nodo<Ele>(newObject);

			while (temp.getNext() != null) {
				temp = temp.getNext();
			}

			temp.setNext(newNode);
		}
		size++;
	}

	public boolean isEmpy() {
		if (head == null)
			return true;
		else
			return false;
	}

	public int getSize() {
		return size;
	}

	public Lista<String> creaList(Lista<String> lista, char x, char y) {
		BufferedReader br;
		String dic;

		try {
			FileReader fr = new FileReader("src//src//es_CR.dic");
			br = new BufferedReader(fr);

			dic = br.readLine();

			while (dic != null) {
				dic = br.readLine();
				String[] word = dic.split("/");

				if (word[0].charAt(0) == x && word[0].charAt(1) == y) {
					lista.addDataEnd(word[0]);
				}

				// System.out.println(word[0]);
			}

		} catch (Exception ex) {
			System.out.println("conejo");

		}
		return lista;
	}

}
