import java.io.Serializable;

public class Ficha implements Serializable{

	private int PosX,PosY;
	private int valor;
	private String letra;

	public Ficha(int valor, String letra) { // constructor que recibe un string que
										// sera signado a la variable letra, y
										// un int que sera asiganado a la
										// variable valor
		this.letra = letra;
		this.valor = valor;
	}
	
	public int getPosX() {//devuelve la posicion x
		return PosX;
	}
	public void setPosX(int posX) {//ubica la posicion x
		PosX = posX;
	}
	public int getPosY() {//devuelve la posicion y
		return PosY;
	}
	public void setPosY(int posY) {//establece la posicion y
		PosY = posY;
	}

	public String getLetra() {// metodo que retorna el valor de la variable
								// letra
		return letra;
	}
	public void setLetra(String let) {
		letra = let;
	}

	public int getValor() {// metodo que retorna el valor de la variable valor
		return valor;
	}
	public void setValor(int puntos) {//define el puntaje
		valor=puntos;
	}
	
	
	
}
