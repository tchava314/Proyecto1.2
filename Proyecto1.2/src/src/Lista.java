import java.io.BufferedReader;
import java.io.FileReader;

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

}
