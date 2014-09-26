import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelOpciones extends JPanel implements ActionListener {

	JButton NewGame, Salir, bot3;// para los botones
	public Image scra;
	public URL fondo;

	PanelOpciones() {
		setLayout(null);
		NewGame = new JButton("Nuevo Juego");
		NewGame.setBackground(new Color(100, 160, 200));// Se cambia el color
														// del
														// boton
		NewGame.setBounds(100, 200, 150, 40);// tamano del boton
		Salir = new JButton("Salir");
		Salir.setBackground(new Color(20, 160, 100));// color
		Salir.setBounds(100, 250, 150, 40);// tamano
		bot3 = new JButton("Ayuda");
		bot3.setBackground(new Color(20, 160, 100));// color
		bot3.setBounds(100, 300, 150, 40);// tamano

		JLabel texto = new JLabel("Scrabble"); // etiqueta
		texto.setFont(new Font("serif", Font.PLAIN, 30));// letra y tamano de
															// letra
		texto.setForeground(new Color(255, 255, 255));// color para la etiqueta
		texto.setBounds(160, 60, 260, 60); // tamano de cuadro

		fondo = this.getClass().getResource("Imagenes/fondo.jpg"); // trae la
																	// imagen
		scra = new ImageIcon(fondo).getImage(); // ubica la imagen en la ventana

		// acciones del boton
		NewGame.addActionListener(this);
		Salir.addActionListener(this);
		bot3.addActionListener(this);

		add(texto);
		add(NewGame);
		add(Salir);
		add(bot3);

		setVisible(true);

	}

	public void paintComponent(Graphics g) {
		g.drawImage(scra, 0, 0, getWidth(), getHeight(), this); // ubica la
																// imagen

	}

	public void actionPerformed(ActionEvent e) {// sobreescribimos el metodo del
												// listener

		if (e.getSource() == NewGame) {
			setVisible(false);
			System.out.println("no");

		}
		if (e.getSource() == Salir) {
			System.out.println("yuuuu");
		}
		if (e.getSource() == bot3) {
			// Ayuda help = new Ayuda();

		}
	}
}