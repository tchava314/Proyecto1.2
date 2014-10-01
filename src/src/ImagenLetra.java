import javax.swing.ImageIcon;

public class ImagenLetra extends ImageIcon {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private String letter;
	private int valor;
	protected boolean moving;
	private boolean locked;

	public void setBloquear(boolean status) { // le asigna un valor de true o
												// false a la
												// variable locked0
		this.locked = status;
	}

	public boolean isBloqueada() {// devuelve el valor booleano contenido en la
									// variable locked
		return this.locked;
	}

	public ImagenLetra(String imagePath) {// constructor que solo
											// recibe la direccion de la imagen)
		super(imagePath);
		this.letter = "";
		this.valor = 0;
		this.x = 0;
		this.y = 0;
		this.moving = false;
		this.locked = false;
	}

	public ImagenLetra(String imagePath, int yp, int xp) {// constructor que
															// recibe la
															// direccion de la
															// imagen,ademas
															// un xp y un yp

		super(imagePath);
		this.letter = "";
		this.valor = 0;
		this.x = xp * 35;
		this.y = yp * 35;
		this.locked = true;
	}

	public ImagenLetra(String imagePath, String letter, int valor, int x, int y) { // constructor
																					// que
																					// ademas
																					// de
																					// lo
																					// anterior
																					// asigna
																					// un
																					// valor
																					// de
																					// string
																					// a
																					// letra
																					// y
																					// un
																					// valor

		super(imagePath);
		this.letter = letter;
		this.valor = valor;
		this.x = x;
		this.y = y;
		this.locked = false;
	}

	public int getValor() {// metodo que retorna la variable valor
		return this.valor;
	}

	public String getLetter() {// metodo que retorna la variable letra
		return this.letter;
	}

	public int getX() {// metodo que devuelve la variable x
		return this.x;
	}

	public int getY() {// metodo retorna la variable Y
		return this.y;
	}

	public void setX(int x) {// metodo que le asigna valor a la vaiable X
		this.x = x;
	}

	public void setY(int y) {// metodo que le asigna valor a la vaiable Y
		this.y = y;
	}
}
