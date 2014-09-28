import java.awt.*;
import java.awt.event.*;
import java.net.URL;

import javax.swing.*;

public class PanelJugador extends JPanel implements ActionListener{

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
		texto.setFont(new Font("serif", Font.PLAIN, 40));// letra y tamano de
															// letra
		texto.setForeground(new Color(255, 255, 255));// color para la etiqueta
		texto.setBounds(160, 80, 260, 60); // tamano de cuadro

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
	
	
	class Mover extends JButton implements MouseListener{    
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private int x, y;
		public Mover(){
			//super.setText(text);
			addMouseListener(this);//lo convierte en mousemotion
			//this.setText(null);

			}

        //public void mouseDragged(MouseEvent mme) {
            //agarra en boton en x ubicacion
        
        	//x=this.getX() + mme.getX() - this.getWidth()/3;
        	//y=this.getY() + mme.getY() - this.getHeight()/3;
       
        	//listaBotones.getObject(0).setText("y");
        	//setLocation(x,y);
            
//			}

	    //public void mouseMoved(MouseEvent mme) {}

		@Override
		public void mouseClicked(MouseEvent e) {
			setLocation(x,y);
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
			//setBackground(new Color(141,238,238));
			
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