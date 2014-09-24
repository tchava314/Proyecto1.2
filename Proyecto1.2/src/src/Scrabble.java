//import package Imagenes; 
import java.awt.*;
import java.io.Serializable;
import java.net.URL;

import javax.swing.*;

public class Scrabble extends JFrame implements Serializable{
	
	//private Tablero tablero;
	
	
	public Scrabble(){
		setSize(920,600); //tamano de la ventana
		setTitle("Scrabble"); //titulo de la ventana
		setLocationRelativeTo(null); //ubica la ventana en el centro de la pantalla
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cuando se seleccione la x se cierra
		Container contenedor= getContentPane(); //se crea el contenedor
		//se agregan los botones a la pantalla
		
		contenedor.setLayout (new GridLayout(1,2));
		JButton cuadro [][] = new JButton[15][15]; //crea una matriz de botones
		JPanel paneltablero = new JPanel(); //crea un panel para el tablero
		paneltablero.setLayout(new GridLayout(15,15)); //hace que sea un cuadro 15x15
		

		for (int i=0; i< 15 ;i++) {
			for (int j=0; j< 15 ;j++) {
				cuadro[i][j] = new JButton();
				cuadro[i][j].setBounds((50*i),(50*j), 50, 50);
				paneltablero.add(cuadro[i][j]);
		     } 
		}
		
	    add(paneltablero);
	    add(new PanelOpciones());
	   
		setVisible(true);
	    }
	    
	
    public static void main (String[] args) {
		
		Scrabble juego= new Scrabble(); //llama la funcion del juego para que se ejecute
	
	}
	
}
