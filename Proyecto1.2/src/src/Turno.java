public class Turno {
	Atril atril;
	Tablero tablero;

	public Turno(Atril atril, Tablero tablero) {
		this.atril = atril;
		this.tablero = tablero;
	}

	public boolean fichaSeguidas(int lastPosX, int lastPosY, int x, int y) {
		if (((lastPosX + 1 == x) && y == lastPosY)
				|| ((lastPosY + 1 == y) && x == lastPosX)) {
			return true;

		} else {
			return false;
		}

	}

	public boolean fichaSeguidasX(int lastPosX, int lastPosY, int x, int y) {
		if ((lastPosX + 1 == x) && y == lastPosY) {
			return true;
		} else {
			return false;
		}
	}

	public boolean fichaSeguidasY(int lastPosX, int lastPosY, int x, int y) {
		if ((lastPosY + 1 == y) && x == lastPosX) {
			return true;
		} else {
			return false;
		}

	}
}
