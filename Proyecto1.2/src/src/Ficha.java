public class Ficha {

	private int valor;
	private String letra;

	Ficha(int valor, String letra) { // constructor que recibe un string que
										// sera signado a la variable letra, y
										// un int que sera asiganado a la
										// variable valor
		this.letra = letra;
		this.valor = valor;
	}

	public String getLetra() {// metodo que retorna el valor de la variable
								// letra
		return letra;
	}

	public void borraLetra() {
		letra = null;
	}

	public int getValor() {// metodo que retorna el valor de la variable valor
		return valor;
	}

	public char getChar() {
		return letra.charAt(0);
	}
}
