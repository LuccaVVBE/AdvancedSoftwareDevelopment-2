package domein;

//VUL DE KLASSE VERDER AAN
public class Vat implements Runnable{ //producer

    private final Tafel tafel;
    private int inhoud;

    public Vat(int emmers, Tafel tafel) {
        inhoud = emmers;
        this.tafel = tafel;
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
			while(inhoud>0) {
				inhoud--;
				tafel.vulEmmer();
			}
			System.out.println("Vat is leeg!");
			tafel.vatIsLeeg();
	}

}
