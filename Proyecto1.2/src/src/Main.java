import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame implements Runnable, ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final ActionEvent ActionEvent = null;
	boolean start;
	Thread principal;

	int i, j;
	int x = 0;
	int y = 0;
	boolean lock = true;
	private Tablero tablero = new Tablero();
	JButton cuadro[][] = new JButton[15][15], derecha, arriba, abajo,
			izquierda, poner; // crea una matriz de botones
	JButton temp, temp2;
	PanelJugador jug1, jug2;
	private static Main m1;
	private String rifa1, rifa2, text;

	Atril atril1, atril2;
	private Color color;
	private boolean move = true;
	private Bolsa bolsa = new Bolsa();

	public Main() {

		atril1 = new Atril(bolsa);
		atril2 = new Atril(bolsa);

		setSize(1300, 700); // tamano de la ventana
		setTitle("Scrabble"); // titulo de la ventana
		setLocationRelativeTo(null); // ubica la ventana en el centro de la
										// pantalla
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // cuando se seleccione
														// la x se cierra
		Container contenedor = getContentPane(); // se crea el contenedor
		// se agregan los botones a la pantalla

		contenedor.setLayout(new GridLayout(1, 2, 10, 0));

		JPanel paneltablero = new JPanel(); // crea un panel para el tablero
		paneltablero.setLayout(new GridLayout(15, 15));// hace que sea un

		JPanel panelJugds = new JPanel(); // crea un panel para el tablero
		panelJugds.setLayout(new GridLayout(7, 2, 0, 10));// cuadro 15x15

		JLabel texto = new JLabel("Scrabble"); // etiqueta
		texto.setFont(new Font("serif", Font.PLAIN, 40));// letra y tamano de
															// letra
		texto.setForeground(new Color(255, 255, 255));// color para la etiqueta
		texto.setBounds(160, 80, 260, 60); // tamano de cuadro
		arriba = new JButton("Arriba");
		abajo = new JButton("Abajo");
		derecha = new JButton("Derecha");
		izquierda = new JButton("Izquierda");
		poner = new JButton("Poner");

		poner.addActionListener(this);
		arriba.addActionListener(this);
		abajo.addActionListener(this);
		derecha.addActionListener(this);
		izquierda.addActionListener(this);

		panelJugds.add(poner);
		panelJugds.add(arriba);

		panelJugds.add(abajo);
		panelJugds.add(izquierda);
		panelJugds.add(derecha);

		jug1 = new PanelJugador();
		jug2 = new PanelJugador();

		panelJugds.add(jug1);
		panelJugds.add(jug2);

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

		add(paneltablero);
		add(panelJugds);

		setVisible(true);
		principal = new Thread(this);
		principal.start();
	}

	private void update() throws InterruptedException {
		if (jug1.rifa && jug2.rifa) {
			rifa1 = JuegoUtils.ganadorrifa2(jug1.getLet(), jug2.getLet());
			rifa2 = JuegoUtils.ganadorrifa2(jug2.getLet(), jug1.getLet());
			if (rifa1.equals(jug2)) {
				jug1.Rifa.setText(rifa1);
				jug2.Rifa.setText(rifa2);
			} else {
				jug1.Rifa.setText(rifa1);
				jug2.Rifa.setText(rifa2);

				jug1.setAtril(atril1);
				jug2.setAtril(atril2);

				text = jug1.getLetra();

			}
		}
	}

	private void mover() {

		if (lock) {
			lock = false;
			temp = cuadro[x][y];
			color = temp.getBackground();
			temp.setBackground(new Color(255, 255, 255));
		}

	}

	private void poner() {
		// temp.setBackground(new Color(255, 255, 255));
		temp.setText(text);
		atril1.setFicha(jug1.pos());
		atril1.rellenar(bolsa);

	}

	private void render() {

		mover();

	}

	@Override
	public void run() {
		start = true;

		while (start) {

			try {
				update();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			render();

			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {

		m1 = new Main();
		System.out.println("aaaa");
	}

	public void setDxy(int dx, int dy) {
		// TODO Auto-generated method stub

		x += dx;
		y += dy;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object src = e.getSource();
		if (src == arriba) {
			if (y <= 15) {
				lock = true;
				temp2 = temp;
				temp2.setBackground(color);
				setDxy(-1, 0);
			}
		}
		if (src == abajo) {
			if (y >= 0) {
				lock = true;
				temp2 = temp;
				temp2.setBackground(color);
				setDxy(1, 0);
			}
		}
		if (src == derecha) {
			if (x < 15) {
				lock = true;
				temp2 = temp;
				temp2.setBackground(color);
				setDxy(0, 1);
			}
		}
		if (src == izquierda) {
			if (x > 0) {
				lock = true;
				temp2 = temp;
				temp2.setBackground(color);
				setDxy(0, -1);
			}
		}
		if (src == poner) {
			lock = true;
			poner();
		}

	}

}
