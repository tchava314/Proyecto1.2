public class Ficha {

	private int valor;
	private String letra;

	Ficha(int valor, String letra) {// constructor que recibe un char y un
									// int, y le asigana estos valores a la
									// variable letra y valor respectivamente
		this.letra = letra;
		this.valor = valor;
	}

	public String getLetra() {// metodo que retorna la variable letra
		return letra;
	}

	public int getValor() {// metodo que retorna la variable valor
		return valor;
	}

	public char getChar() {
		return letra.charAt(0);
	}

}
