package domein;

public class Delete implements Command {

	private Document document;
	private String deTekst;
	private int eersteVoorkomen=-1;
	
	public void execute() {
		eersteVoorkomen = document.getFirstIndexOf(deTekst);
		document.erase(deTekst);
	}

	public Delete(Document doc, String tekst) {
		document = doc;
		deTekst = tekst;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		if(eersteVoorkomen!=-1) {
		document.insert(deTekst, eersteVoorkomen);
		eersteVoorkomen=-1;
		}
	}

}
