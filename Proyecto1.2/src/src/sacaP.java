
public class sacaP {
	private static int xPalabra=1, puntaje=0, vbonus=1,valor;
	public static int sumar(String fc, int x, int y,Tablero tab){
		if (fc.equals("f")){
			if (tab.getCas(x,y).getFicha().getLetra()== null)
				return 0;
			while (tab.getCas(x,y).getFicha().getLetra()!= null && x>=0){
				x--;
			}
			while(true){
				x++;
				if (x>14)
					break;
				if (tab.getCas(x, y).getFicha().getLetra()==null)
					break;
				valor= tab.getCas(x, y).getFicha().getValor();
				String bonus= tab.getCas(x,y).getBonus();
				if (bonus!=null){
					
					if (bonus.equals("2L")){
						vbonus=2;
					}
					else if (bonus.equals("3L")){
						vbonus=3;
					}
					else if (bonus.equals("2P")){
						xPalabra=2;
					}
					else if (bonus.equals("3P")){
						xPalabra=3;
					}
				}
				puntaje=puntaje + valor*vbonus;
			}
			puntaje=puntaje*xPalabra;
			return puntaje;
		}
		else{
			if (tab.getCas(x,y).getFicha().getLetra()==null)
				return 0;
			while (tab.getCas(x,y).getFicha().getLetra()!= null && y>=0){
				y--;
			}
			while(true){
				y++;
				if (y>14)
					break;
				if (tab.getCas(x, y).getFicha().getLetra()==null)
					break;
				int vbonus=1;
				valor= tab.getCas(x, y).getFicha().getValor();
				String bonus= tab.getCas(x,y).getBonus();
				if (bonus!=null){
					
					if (bonus.equals("2L")){
						vbonus=2;
					}
					else if (bonus.equals("3L")){
						vbonus=3;
					}
					else if (bonus.equals("2P")){
						xPalabra=2;
					} 
					else if (bonus.equals("3P")){
						xPalabra=3;
					}
				}
				puntaje=puntaje+valor*vbonus;
			}
			puntaje=puntaje*xPalabra;
			return puntaje;		
		}
	}
}