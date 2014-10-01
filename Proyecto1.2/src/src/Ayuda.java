import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ayuda implements ActionListener {
	JFrame frame = new JFrame("Ayuda de Scrabble");
	Button atras = new Button("Atras");

	public Ayuda() {
		JPanel buttonPanel = new JPanel();// crea un panel
		buttonPanel.add(atras);// anade un boton
		frame.setLocationRelativeTo(null); // ubica la ventana en el centro de
											// la pantalla
		atras.addActionListener(this);// le pone el listener para el momento de
										// presionarlo

		frame.setLayout(new BorderLayout());

		JPanel msg = new JPanel();
		// se crean puros mensajes
		msg.setLayout(new GridLayout(14, 1));
		msg.add(new Label("Coloca letras en el tablero una por una."));
		msg.add(new Label("Cuando tengas la palabra formada presiona ok"));
		msg.add(new Label(""));
		msg.add(new Label("Ok : Es para que compruebe si tu palabra existe"));

		msg.add(new Label(
				"Saltar Turno : Has click cuando quieras pasar de turno"));
		msg.add(new Label("                 aunque tengas alguna jugada"));
		msg.add(new Label("Salir       : Acaba el juego"));
		msg.add(new Label("Restaurar : Si aun no has desidido acabar tu turno"));
		msg.add(new Label(
				"            y crees que la palabra que formaste no es"));
		msg.add(new Label(
				"            es la que querias o te equivocaste, este"));
		msg.add(new Label(
				"            boton regresa la ultima ficha usada durante el turno"));
		msg.add(new Label("Ayuda    : Muestra esta ventana"));

		frame.add("North", msg);
		frame.add("South", buttonPanel);
		frame.pack();
		frame.setVisible(true);// pone visible la ventana
	}

	public void actionPerformed(ActionEvent a) {
		if (a.getActionCommand().equals("Atras")) {// si se selecciona el boton
			frame.setVisible(false);// desaparece la ventana de ayuda
		}
	}
}