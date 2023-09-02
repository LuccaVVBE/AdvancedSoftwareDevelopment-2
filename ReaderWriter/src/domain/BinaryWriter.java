package domain;

public class BinaryWriter implements Writer {

	public void write(Drawing inhoud, String fileName) {
		System.out.println("Binair aan het schrijven van bestand: "+fileName + ". Content: " + inhoud.getClass().getSimpleName());
	}
}
