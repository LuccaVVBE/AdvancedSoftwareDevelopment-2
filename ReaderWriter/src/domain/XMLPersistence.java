package domain;

public class XMLPersistence implements PersistentieFactory {

	public Reader createReader() {
		return new XMLReader();
	}

	public Writer createWriter() {
		return new XMLWriter();
	}
}
