public class Ficha {

	private int valor;
	private char letra;

	Ficha(int valor, char letra) {// constructor que recibe un char y un
									// int, y le asigana estos valores a la
									// variable letra y valor respectivamente
		this.letra = letra;
		this.valor = valor;
	}

	public char getLetra() {// metodo que retorna la variable letra
		return letra;
	}

	public int getValor() {// metodo que retorna la variable valor
		return valor;
	}
}
