package domain;

public class BinaryReader implements Reader {

	public Drawing read(String fileName) {
		System.out.println("Binair aan het lezen van bestand: "+fileName);
		return new Drawing();
	}
}
