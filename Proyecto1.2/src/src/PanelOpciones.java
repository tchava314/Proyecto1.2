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

	JButton NewGame, Salir, bot3, jug1, jug2, empezar;// para los botones
	public Image scra;
	public URL fondo;
	char let, let2;

	PanelOpciones() {
		setLayout(null);
		NewGame = new JButton("Nuevo Juego");
		NewGame.setBackground(new Color(127, 255, 212));// Se cambia el color
														// del boton
		NewGame.setBounds(150, 200, 150, 40);// tamano del boton
		Salir = new JButton("Salir");
		Salir.setBackground(new Color(127, 255, 212));// color
		Salir.setBounds(150, 250, 150, 40);// tamano
		bot3 = new JButton("Ayuda");
		bot3.setBackground(new Color(127, 255, 212));// color
		bot3.setBounds(150, 300, 150, 40);// tamano
		jug1 = new JButton("Jugador 1");
		jug1.setBackground(new Color(255, 211, 155));
		jug1.setBounds(150, 200, 150, 40);
		jug2 = new JButton("Jugador 2");
		jug2.setBackground(new Color(255, 211, 155));
		jug2.setBounds(150, 300, 150, 40);
		empezar = new JButton("Empezar");
		empezar.setBackground(new Color(255, 211, 155));
		empezar.setBounds(150, 400, 150, 40);

		JLabel texto = new JLabel("Scrabble"); // etiqueta
		texto.setFont(new Font("serif", Font.PLAIN, 40));// letra y tamano de
															// letra
		texto.setForeground(new Color(255, 255, 255));// color para la etiqueta
		texto.setBounds(160, 80, 260, 60); // tamano de cuadro

		fondo = this.getClass().getResource("Imagenes/fondo.jpg"); // trae la
																	// imagen
		scra = new ImageIcon(fondo).getImage(); // ubica la imagen en la ventana

		// acciones del boton
		NewGame.addActionListener(this);
		Salir.addActionListener(this);
		bot3.addActionListener(this);
		jug1.addActionListener(this);
		jug2.addActionListener(this);
		empezar.addActionListener(this);

		add(texto);
		add(NewGame);
		add(Salir);
		add(bot3);
		add(jug1);
		add(jug2);
		add(empezar);

		jug1.setVisible(false);
		jug2.setVisible(false);
		empezar.setVisible(false);

		setVisible(true);

	}

	public void paintComponent(Graphics g) {
		g.drawImage(scra, 0, 0, getWidth(), getHeight(), this); // ubica la
																// imagen

	}

	public void actionPerformed(ActionEvent e) {// sobreescribimos el metodo del
												// listener
		char x = 'a';
		if (e.getSource() == NewGame) {
			NewGame.setVisible(false);
			Salir.setVisible(false);
			bot3.setVisible(false);
			jug1.setVisible(true);
			empezar.setName(null);
			jug2.setVisible(true);
			empezar.setVisible(true);

		}
		if (e.getSource() == jug1) {
			let = JuegoUtils.letraAleatoria();
			System.out.println(let);
			jug1.setText("jug1=" + let);

		}
		if (e.getSource() == jug2) {
			let2 = JuegoUtils.letraAleatoria();
			System.out.println(let2);
			jug2.setText("jug2=" + let2);
		}
		if (e.getSource() == empezar) {
			System.out.println(JuegoUtils.ganadorrifa2(let, let2));

		}

		if (e.getSource() == Salir) {
			System.out.println("yuuuu");
		}
		if (e.getSource() == bot3) {
			// Ayuda help = new Ayuda();

		}
	}
}
