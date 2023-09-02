public class Monopoly extends Game {

	public void initializeGame() {
		System.out.println("Game started");
	}

	public void move(int player) {
		System.out.println("Player " + player + " moved.");
	}

	public boolean endOfGame() {
		throw new UnsupportedOperationException();
	}

	public void printWinner() {
		throw new UnsupportedOperationException();
	}
}
