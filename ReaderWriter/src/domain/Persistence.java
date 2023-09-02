package domain;

public class Persistence {

	private PersistentieFactory persistenceFactory;

	public Persistence(PersistentieFactory facotry) {
		this.persistenceFactory = facotry;
	}

	public Reader geefReader() {
		return persistenceFactory.createReader();
	}

	public Writer geefWriter() {
		return persistenceFactory.createWriter();
	}
}
