import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;

public class Lista<Ele> {

	private static BufferedReader br;
	Nodo<Ele> head;
	protected int size;

	public Lista() {// constructor que da valores por defecto a las variables
		head = null;
		size = 0;
	}

	public Ele getObject(int pos) {// metodo que que retorna el objeto contenido
									// en una posicion especifica de la lista
		int count = 0;
		Nodo<Ele> temp = head;

		while (count < pos) {
			temp = temp.getNext();
			count++;
		}
		return temp.getData();
	}

	public void addDataBegin(Ele newObject) {// metodo que agrega un nuevo
												// objeto al inicio de la lista

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

	public void addDataEnd(Ele newObject) {// metodo que agrega un nuevo objeto
											// al final de lista

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

	public void eliminar(Ele letra) {
		Nodo<Ele> act = head, ant = null;
		boolean find = false;
		while ((act != null) && (!find)) {
			find = (act.getData() == letra);
			if (!find) {
				ant = act;
				act = act.getNext();
			}
		}
		if (act != null) {
			if (act == head) {
				head = act.getNext();
			} else {
				ant.setNext(act.getNext());
			}
			act = null;

		}

		size = size - 1;
	}

	public boolean isEmpy() {// metodo que indica true si la lista esta vacia y
								// false en el caso contrario
		if (head == null)
			return true;
		else
			return false;
	}

	public int getSize() {// retorna el valor del tamaño de la lista
		return size;
	}

	public Lista<String> creaLista_Letra(char x) {// crea una lista con las
													// palabras de un archivo
													// txt que empiecen con una
													// letra especifica

		Lista<String> listaLetra = new Lista<String>();

		try {
			FileReader fr = new FileReader("src//CROSSWD.TXT");
			br = new BufferedReader(fr);

			String word;
			word = br.readLine();

			while (word.charAt(0) == x) {

				// System.out.println(""+ word);
				listaLetra.addDataEnd(word);
				word = br.readLine();

			}
		} catch (Exception ex) {
			System.out.println("error");

		}

		return listaLetra;

	}

	public Ele EleAzar() {// metodo que devuelve un elemento al azar
		Random azar = new Random();
		int pos = azar.nextInt(this.getSize());
		Ele x = this.getObject(pos);
		// this.eliminar(x);
		return x;

	}// fin metodo fichaAzar
}
