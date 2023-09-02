package domain;

public class XMLReader implements Reader {

	public Drawing read(String fileName) {
		System.out.println("XML aan het lezen van bestand: "+fileName);
		return new Drawing();
	}
}
