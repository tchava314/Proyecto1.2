//import package Imagenes; 
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Scrabble extends JFrame implements ActionListener {

	int i, j;
	private Tablero tablero = new Tablero();
	JButton cuadro[][] = new JButton[15][15]; // crea una matriz de botones

	public Scrabble() {
		setSize(920, 600); // tamano de la ventana
		setTitle("Scrabble"); // titulo de la ventana
		setLocationRelativeTo(null); // ubica la ventana en el centro de la
										// pantalla
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cuando se seleccione
														// la x se cierra
		Container contenedor = getContentPane(); // se crea el contenedor
		// se agregan los botones a la pantalla

		contenedor.setLayout(new GridLayout(1, 2));

		JPanel paneltablero = new JPanel(); // crea un panel para el tablero
		paneltablero.setLayout(new GridLayout(15, 15)); // hace que sea un
														// cuadro 15x15

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				cuadro[i][j] = new JButton();
				cuadro[i][j].setBounds((50), (50), 100, 100);
				paneltablero.add(cuadro[i][j]);
			}
		}

		cuadro[0][3].setBackground(Color.cyan);
		cuadro[0][11].setBackground(Color.cyan);
		cuadro[2][6].setBackground(Color.cyan);
		cuadro[2][8].setBackground(Color.cyan);
		cuadro[3][7].setBackground(Color.cyan);
		cuadro[3][0].setBackground(Color.cyan);

		cuadro[3][14].setBackground(Color.cyan);
		cuadro[6][2].setBackground(Color.cyan);
		cuadro[6][6].setBackground(Color.cyan);
		cuadro[6][8].setBackground(Color.cyan);
		cuadro[6][12].setBackground(Color.cyan);
		cuadro[7][3].setBackground(Color.cyan);
		cuadro[7][11].setBackground(Color.cyan);
		cuadro[8][2].setBackground(Color.cyan);
		cuadro[8][6].setBackground(Color.cyan);
		cuadro[8][8].setBackground(Color.cyan);
		cuadro[8][12].setBackground(Color.cyan);
		cuadro[11][0].setBackground(Color.cyan);
		cuadro[11][7].setBackground(Color.cyan);
		cuadro[11][14].setBackground(Color.cyan);
		cuadro[12][6].setBackground(Color.cyan);
		cuadro[12][8].setBackground(Color.cyan);
		cuadro[14][3].setBackground(Color.cyan);
		cuadro[14][11].setBackground(Color.cyan);

		cuadro[0][0].setBackground(Color.red);
		cuadro[7][14].setBackground(Color.red);
		cuadro[0][14].setBackground(Color.red);
		cuadro[7][0].setBackground(Color.red);
		cuadro[14][0].setBackground(Color.red);
		cuadro[14][7].setBackground(Color.red);
		cuadro[0][7].setBackground(Color.red);
		cuadro[14][14].setBackground(Color.red);

		cuadro[1][1].setBackground(new Color(255, 160, 100));
		cuadro[2][2].setBackground(new Color(255, 160, 100));
		cuadro[3][3].setBackground(new Color(255, 160, 100));
		cuadro[4][4].setBackground(new Color(255, 160, 100));

		cuadro[10][10].setBackground(new Color(255, 160, 100));
		cuadro[11][11].setBackground(new Color(255, 160, 100));
		cuadro[12][12].setBackground(new Color(255, 160, 100));
		cuadro[13][13].setBackground(new Color(255, 160, 100));

		cuadro[4][10].setBackground(new Color(255, 160, 100));
		cuadro[10][4].setBackground(new Color(255, 160, 100));
		cuadro[1][13].setBackground(new Color(255, 160, 100));
		cuadro[2][12].setBackground(new Color(255, 160, 100));
		cuadro[3][11].setBackground(new Color(255, 160, 100));
		cuadro[13][1].setBackground(new Color(255, 160, 100));
		cuadro[12][2].setBackground(new Color(255, 160, 100));
		cuadro[11][3].setBackground(new Color(255, 160, 100));
		cuadro[7][7].setBackground(new Color(255, 160, 100));

		cuadro[0][3].setBackground(Color.cyan);

		cuadro[1][5].setBackground(new Color(20, 100, 255));
		cuadro[1][9].setBackground(new Color(20, 100, 255));
		cuadro[5][1].setBackground(new Color(20, 100, 255));
		cuadro[5][9].setBackground(new Color(20, 100, 255));
		cuadro[5][5].setBackground(new Color(20, 100, 255));
		cuadro[5][13].setBackground(new Color(20, 100, 255));
		cuadro[9][1].setBackground(new Color(20, 100, 255));
		cuadro[9][5].setBackground(new Color(20, 100, 255));
		cuadro[9][9].setBackground(new Color(20, 100, 255));
		cuadro[9][13].setBackground(new Color(20, 100, 255));
		cuadro[13][5].setBackground(new Color(20, 100, 255));
		cuadro[13][9].setBackground(new Color(20, 100, 255));
		cuadro[5][7].setBackground(new Color(20, 100, 255));

		// tablero.getCas(4,3);
		add(paneltablero);
		add(new PanelOpciones());

		setVisible(true);
	}

	public static void main(String[] args) {

		// Scrabble juego= new Scrabble(); //llama la funcion del juego para que
		// se ejecute
		System.out.println("aaaa");
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == cuadro[0][0]) {
			System.out.println(0);
			System.out.println(0);

		}
		if (src == cuadro[0][1]) {
			System.out.println(0);
			System.out.println(1);

		}

	}

}
