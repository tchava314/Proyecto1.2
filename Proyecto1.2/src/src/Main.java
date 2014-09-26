/**
 * public class Main {
 * 
 * static boolean rifa = false; static int NumJug = 2, tempJug = NumJug,
 * ganadorRifa, cont = 1, Temp = -1;
 * 
 * public static void main(String arg[]) { Scrabble ariel = new Scrabble();
 * 
 * Tablero tablero = new Tablero(); Fichas bolsa = new Fichas(); Lista<Ficha>
 * bag = bolsa.crearFichas(); while (rifa == false) {// se decide que jugador es
 * el primero en // comenzar tempJug = 2; cont = 1; Temp = -2; int x = -1; while
 * (tempJug > 0) {
 * 
 * Ficha jug = bag.EleAzar(); System.out.println(bag.size + "tam");
 * bag.eliminar(jug); x = JuegoUtils.turnoSalida(jug); System.out.println(x +
 * " retorno");
 * 
 * if (x < Temp) { ganadorRifa = cont; System.out.println(ganadorRifa +
 * "  ganador"); rifa = true; System.out.println(rifa); } if (Temp < x) {
 * ganadorRifa = cont - 1; rifa = true; } if (x == Temp) { rifa = false;
 * System.out.println(rifa); } Temp = x; System.out.println(Temp + " temp");
 * tempJug--; cont++;
 * 
 * } }
 * 
 * System.out.println(ganadorRifa + "ganador");
 * 
 * // for (int i = 0; i < bag.getSize(); i++) { // System.out.println("" + i);
 * // }
 * 
 * } }
 */
