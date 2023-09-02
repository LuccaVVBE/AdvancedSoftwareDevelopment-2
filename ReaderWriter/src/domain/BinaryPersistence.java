package domain;

public class BinaryPersistence implements PersistentieFactory {

	public Reader createReader() {
		return new BinaryReader();
	}

	public Writer createWriter() {
		return new BinaryWriter();
	}
}
