//import package Imagenes; 
import java.awt.*;
import java.net.URL;

import javax.swing.*;


public class Scrabble extends JFrame{
	public Image imagenFondo;
	public URL fondo;
	//private Tablero tablero;
	String foto;
	Casilla casi=new Casilla(null, "A");
	ImageIcon letra3=new ImageIcon("/Imagenes/B.gif");
	
	Scrabble(){
		setSize(920,600); //tamano de la ventana
		setTitle("Scrabble"); //titulo de la ventana
		setLocationRelativeTo(null); //ubica la ventana en el centro de la pantalla
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cuando se seleccione la x se cierra
		
		Container contenedor= getContentPane(); //se crea el contenedor
		//se agregan los botones a la pantalla
		contenedor.setLayout (new GridLayout(1,2));
		
		
		foto= "/Imagenes/tablero.jpg";
		fondo= this.getClass().getResource(this.foto); //trae la imagen
		imagenFondo= new ImageIcon(fondo).getImage(); //ubica la imagen en la ventana
		
		JButton cuadro [][] = new JButton[15][15]; //crea una matriz de botones
	    JPanel paneltablero = new JPanel(); //crea un panel para el tablero
	    paneltablero.setLayout(new GridLayout(15,15)); //hace que sea un cuadro 15x15
	    for (int i=0; i< 15 ;i++) { 
	    	for (int j=0; j< 15 ;j++) { 
	        cuadro[i][j] = new JButton(); 
	        cuadro[i][j].setBounds((50*i),(50*j), 50, 50); 
	        paneltablero.add(cuadro[i][j]); 

	    	} 
	    	//metodo para colocar las imagenes a los botones
	    }
	    
	    
	    add(paneltablero);
	    add(new PanelOpciones());
	   
		setVisible(true);
	    }
		

	
	public void paintComponent(Graphics g){
		g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this); //ubica la imagen
			
	}
    public static void main (String[] args) {
		
		Scrabble juego= new Scrabble(); //llama la funcion del juego para que se ejecute
	
	}
	
}
