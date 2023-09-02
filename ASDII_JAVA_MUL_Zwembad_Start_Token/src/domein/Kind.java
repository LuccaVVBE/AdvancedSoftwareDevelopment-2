package domein;

import java.security.SecureRandom;

// VUL DE KLASSE VERDER AAN
public class Kind implements Runnable{ //Consumer

    private final Tafel tafel;
    private final Zwembad zwembad;
    private final String naam;
    private static final SecureRandom generator = new SecureRandom();

    public Kind(Tafel tafel, Zwembad zwembad, String naam) {
        this.tafel = tafel;
        this.zwembad = zwembad;
        this.naam = naam;
    }

    public void run() {
    	while(!zwembad.vol() && tafel.pakEmmer()) {
    		try {
				Thread.sleep(generator.nextLong(2000,3000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		zwembad.gietEmmer();
    		System.out.printf("%s heeft emmer opgehaald%n", naam);
    		
    	}

        System.out.printf("%s : "
                + (zwembad.vol() ? "zwembad vol" : "reeds "
                        + zwembad.getInhoud() + " emmers") + "\n", naam);
        
        
        
    }
}
