package domein;

public class CommandFactory {

	private Document document;

	public Command createCommand(String tekst, String actie) {
		switch(actie.toLowerCase()) {
		case "concat":
			return new Concat(document,tekst);
			
		case "delete":
			return new Delete(document, tekst);
			
		default:
			return new NoCommand();
			
		}
	}

	public CommandFactory(Document doc) {
		document = doc;
	}
}
