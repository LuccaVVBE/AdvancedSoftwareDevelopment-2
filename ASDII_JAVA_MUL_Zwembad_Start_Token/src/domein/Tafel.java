package domein;
import java.security.SecureRandom;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

// VUL DE KLASSE VERDER AAN
public class Tafel {

    private static final SecureRandom generator = new SecureRandom();
    private boolean vatLeeg = false;
    private BlockingQueue<Boolean> emmerBuffer;

    public Tafel(int aantalEmmers) {
    	emmerBuffer = new ArrayBlockingQueue<>(aantalEmmers);
    }

    public void vulEmmer() {
    	try {
    		Thread.sleep(generator.nextLong(1000,2001));
    		emmerBuffer.put(true);
    	}catch(InterruptedException ie) {
    		ie.printStackTrace();
    		Thread.currentThread().interrupt();
    	}
    }

    public boolean pakEmmer() {
//    	boolean emmerGenomen = false;
//    	try {
//    		do {
//    			Boolean x = emmerBuffer.poll(50L, TimeUnit.MILLISECONDS);// kan null returnen - null kan niet in boolean maar wel in Boolean
//    			if(x!=null) {
//    				emmerGenomen=true;
//    			}
//    		}while(!vatLeeg && !emmerGenomen);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//    	return emmerGenomen;
    	try {
			boolean value = emmerBuffer.take();
			if(!value) {
				emmerBuffer.put(value);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
    	return false;
    }

//    public void setVatLeeg(boolean vatLeeg) {
//        this.vatLeeg = vatLeeg;
//    }

	public void vatIsLeeg() {
		// TODO Auto-generated method stub
		try {
			emmerBuffer.put(false);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
