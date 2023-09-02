package domein;

import java.util.Objects;

public class PegAdapter implements ISquarePeg, IRoundPeg {

	private IRoundPeg roundPeg;
	private ISquarePeg squarePeg;

	public void insert(String str) {
		if(!Objects.isNull(roundPeg))
		roundPeg.insertIntoHole(str);
	}

	public void insertIntoHole(String mes) {
		if(!Objects.isNull(squarePeg))
		squarePeg.insert(mes);
	}

	public PegAdapter(ISquarePeg square) {
		squarePeg=square;
	}

	public PegAdapter(IRoundPeg round) {
		roundPeg = round;
	}
}
