import java.awt.*;
import java.awt.event.*;
import java.net.URL;

import javax.swing.*;


public class PanelOpciones extends JPanel implements ActionListener {
	
	JButton salto,pasa,bot3;//para los botones
	public Image scra;
	public URL fondo;
	
	
	PanelOpciones(){
		setLayout(null);
		salto= new JButton("Saltar Turno");
        salto.setBackground(new Color(240,160,100));//Se cambia el color del boton
        salto.setBounds(80,200,150,40);//tamano del boton
        pasa= new JButton("Pasar Turno");
        pasa.setBackground(new Color(200,200,200));//color
        pasa.setBounds(80,250,150,40);//tamano
        bot3= new JButton("Ayuda");
        bot3.setBackground(new Color(200,200,200));//color
        bot3.setBounds(80,300,150,40);//tamano
        
        
        JLabel texto= new JLabel("Scrabble"); //etiqueta
        texto.setFont( new Font("serif", Font.PLAIN, 30));//letra y tamano de letra
        texto.setForeground(new Color(255,255,255));//color para la etiqueta
        texto.setBounds(160,60,260,60); //tamano de cuadro
 
		fondo= this.getClass().getResource("/Imagenes/fondo.jpg"); //trae la imagen
		scra= new ImageIcon(fondo).getImage(); //ubica la imagen en la ventana
		
		//acciones del boton
        salto.addActionListener(this);
        pasa.addActionListener(this);
        bot3.addActionListener(this);
        
        add(texto);
        add(pasa);
		add(salto);
		add(bot3);
		
        setVisible(true);
	}
	public void paintComponent(Graphics g){
		g.drawImage(scra, 0, 0, getWidth(), getHeight(), this); //ubica la imagen
			
	}
	public void actionPerformed(ActionEvent e) {//sobreescribimos el metodo del listener
		 
        if(e.getSource()==salto){
        	setVisible(false);
        	System.out.println("no");	
    	    
        }
        if(e.getSource()==pasa){
        	setVisible(false);
        	System.out.println("jh");
        }
        if(e.getSource()==bot3){
        	Ayuda help=new Ayuda();
        	
        }
    }
}
