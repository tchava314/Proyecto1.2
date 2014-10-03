public class Bolsa extends Lista<Ficha> {
public Bolsa() {
crearFichas();
}
public void crearFichas() {
for (int i = 1; i <= 2; i++) {
addDataEnd(new Ficha(0, "*"));
addDataEnd(new Ficha(3, "B"));
addDataEnd(new Ficha(3, "C"));
addDataEnd(new Ficha(3, "M"));
addDataEnd(new Ficha(3, "P"));
addDataEnd(new Ficha(4, "F"));
addDataEnd(new Ficha(4, "H"));
addDataEnd(new Ficha(4, "V"));
addDataEnd(new Ficha(4, "W"));
addDataEnd(new Ficha(4, "Y"));
}// fin for 2
for (int i = 1; i <= 12; i++) {
addDataEnd(new Ficha(1, "E"));
}// fin for 12
for (int i = 1; i <= 9; i++) {
addDataEnd(new Ficha(1, "A"));
addDataEnd(new Ficha(1, "I"));
}// fin for 9
for (int i = 1; i <= 4; i++) {
addDataEnd(new Ficha(1, "I"));
addDataEnd(new Ficha(1, "S"));
addDataEnd(new Ficha(1, "U"));
addDataEnd(new Ficha(2, "D"));
}// fin for 4
for (int i = 1; i <= 8; i++) {
addDataEnd(new Ficha(1, "O"));
}// fin for 8
for (int i = 1; i <= 6; i++) {
addDataEnd(new Ficha(1, "N"));
addDataEnd(new Ficha(1, "R"));
addDataEnd(new Ficha(1, "T"));
}// fin for 6
for (int i = 1; i <= 3; i++) {
addDataEnd(new Ficha(2, "G"));
}// fin for 3
addDataEnd(new Ficha(5, "K"));
addDataEnd(new Ficha(8, "J"));
addDataEnd(new Ficha(8, "X"));
addDataEnd(new Ficha(10, "Q"));
addDataEnd(new Ficha(10, "Z"));
}// fin metodo crearfichas
}// fin de la clase