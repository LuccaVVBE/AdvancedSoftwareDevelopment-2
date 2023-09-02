public abstract class Game {

	private int playerCount;

	public final void playOneGame(int playerCount) {
		setPlayerCount(playerCount);
		initializeGame();
		int player = -1;
		while(!endOfGame()) {
			player+=1;
			move(player);
		}
		printWinner();
	}

	protected abstract void initializeGame();

	protected abstract void move(int player);

	protected abstract boolean endOfGame();

	protected abstract void printWinner();

	private void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}
}
