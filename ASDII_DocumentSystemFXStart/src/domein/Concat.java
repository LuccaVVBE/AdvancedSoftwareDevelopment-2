package domein;

public class Concat implements Command {

	private Document document;
	private String deTekst;

	public void execute() {
		document.concat(deTekst);
	}

	public Concat(Document doc, String tekst) {
		document = doc;
		deTekst=tekst;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		document.removeAtEnd(deTekst);
	}

}
