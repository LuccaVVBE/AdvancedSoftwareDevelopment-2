package domain;

public class XMLWriter implements Writer {

	public void write(Drawing inhoud, String fileName) {
		System.out.println("XML aan het lezen van bestand: "+fileName + ". Content: " + inhoud.getClass().getSimpleName());

	}
}
