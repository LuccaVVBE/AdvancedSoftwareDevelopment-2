package domain;

public interface PersistentieFactory {

	Reader createReader();

	Writer createWriter();
}
