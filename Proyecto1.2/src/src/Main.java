
public class Main {
	
	public static void main (String arg[]){
		
		
		/**char a=97;
		Lista<Lista<String>> ABC= new Lista<Lista<String>>();
		Lista<String> letraA ;
		**/
		
		
		Tablero t= new Tablero(new Diccionario());
		//tablero.setCas(new Casilla("g",4), 5, 5);
		t.getCas(9, 0).setFicha(new Ficha(3,"R"));
		t.getCas(1, 0).setFicha(new Ficha(3,"A"));
		t.getCas(2, 0).setFicha(new Ficha(3,"T"));
		t.getCas(3, 0).setFicha(new Ficha(3,"A"));
		t.getCas(4, 0).setFicha(new Ficha(3,"O"));
		//t.getCas(8, 0 ).setFicha(new Ficha(3,"p"));
		/*t.getCas(1, 0).setFicha(new Ficha(3,"e"));
		t.getCas(9, 0).setFicha(new Ficha(3,"r"));
		t.getCas(4, 0).setFicha(new Ficha(3,"r"));
		t.getCas(5, 0).setFicha(new Ficha(3,"o"));
		*/
		//System.out.print(t.leer("f", 10));
		System.out.print(sacaP.sumar("f",3, 0, t));	
		/**tablero.setCas(new Casilla(new Ficha(0,null)),0,0);
		Casilla algo=tablero.getCas(5, 5);
		
		System.out.print(""+algo.getBonus());
		
		
		
		
		
		
		
		for (int i=65; i<91; i++){
			
			
			ABC.addDataEnd(new Lista<String>());
			//System.out.println(""+(char)i);
		}
		
		
		letraA = ABC.getObject(0);
		
		letraA= letraA.creaLista(a);
		String b="perro";
		String c="perro";
		System.out.print(b==c);
		**/
		
		
		
		
		
		
		
		
		
		/**
		for (int i=0; i<26; i++){
			
			 obj = ABC.getObject(i);
			 temp= (Lista)obj;
			 Alfabeto.addDataEnd(temp);
			 
			System.out.println(""+obj);
		}
		
		**/
		
		
		
		
		
		
		
	}

	

}
