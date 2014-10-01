import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelJugador extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton Rifa;
	public Image scra;
	public URL fondo;
	char let;
	public boolean rifa = false;
	String texto;

	public Lista<String> lista1;

	Lista<JButton> listaBotones = new Lista<JButton>();

	PanelJugador() {
		setLayout(new GridLayout(2, 0, 20, 20));
		Rifa = new JButton("Rifa");
		Rifa.setBackground(new Color(127, 255, 212));// Se cambia el color
														// del boton

		for (int i = 0; i < 7; i++) {
			listaBotones.addDataEnd(new JButton());
			listaBotones.getObject(i).addActionListener(this);
		}

		JLabel texto = new JLabel("Jugador"); // etiqueta
		texto.setFont(new Font("serif", Font.PLAIN, 4));// letra y tamano de
														// letra
		texto.setForeground(new Color(0, 0, 0));// color para la etiqueta

		fondo = this.getClass().getResource("Imagenes/fondo.jpg"); // trae la
																	// imagen
		// scra = new ImageIcon(fondo).getImage(); // ubica la imagen en la
		// ventana

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
		g.fillRect(0, 0, getWidth(), getWidth());

	}

	public char getLet() {
		return let;
	}

	public String getLetra() {
		return texto;
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