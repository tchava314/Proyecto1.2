import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelJugador extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton Rifa;

	char let;
	public boolean rifa = false;
	private String texto;

	public Lista<String> lista1;

	Lista<JButton> listaBotones = new Lista<JButton>();

	public PanelJugador() {
		setLayout(new GridLayout(2, 0, 20, 20));
		Rifa = new JButton("Rifa");
		Rifa.setBackground(new Color(127, 255, 212));// Se cambia el color
														// del boton

		for (int i = 0; i < 7; i++) {
			listaBotones.addDataEnd(new Mover());
			listaBotones.getObject(i).addActionListener(this);

		}

		JLabel texto = new JLabel("Jugador"); // etiqueta
		texto.setFont(new Font("serif", Font.PLAIN, 7));// letra y tamano de
														// letra
		texto.setForeground(new Color(255, 255, 255));// color para la etiqueta
		texto.setBounds(160, 80, 260, 60); // tamano de cuadro

		// acciones del boton
		Rifa.addActionListener(this);

		// add(texto);
		add(Rifa);

		for (int i = 0; i < 7; i++) {
			add(listaBotones.getObject(i));

		}
		setVisible(true);

	}

	public void setText(Tablero atril2) {
		for (int i = 0; i < 7; i++) {
			listaBotones.getObject(i).setText(
					atril2.getCas(i, 1).getFicha().getLetra());

		}

	}

	public void paintComponent(Graphics g) {
		g.fillRect(600, 0, getWidth(), getWidth());
	}

	public char getLet() {
		return let;
	}

	public String getLetra() {
		return texto;
	}

	class Mover extends JButton implements MouseListener {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int x, y;

		public Mover() {
			addMouseListener(this);// lo convierte en mousemotion

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			setLocation(x, y);
			setText(null);
			setBackground(Color.cyan);
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			setBackground(Color.cyan);

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			setBackground(null);
			setText(null);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			setBackground(Color.cyan);
			// setBackground(new Color(141,238,238));

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			setBackground(null);
		}

	}

	public void actionPerformed(ActionEvent e) {// sobreescribimos el metodo del
												// listener

		if (e.getSource() == Rifa) {
			let = JuegoUtils.letraAleatoria();
			rifa = true;

			System.out.println(let);
		}
		for (int i = 0; i < 7; i++) {

			if (e.getSource() == listaBotones.getObject(i)) {

				texto = listaBotones.getObject(i).getText();

				System.out.println(texto);
			}

		}
	}
}