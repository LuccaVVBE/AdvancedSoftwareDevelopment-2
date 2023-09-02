package domain;

public abstract class Document {

	public final void preparePrint() {
		printHeader();
		printBody();
		printFooter();
	}

	protected abstract void printHeader();

	protected abstract void printBody();

	protected abstract void printFooter();
}
