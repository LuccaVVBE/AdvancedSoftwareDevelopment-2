package domein;

import java.security.SecureRandom;

public class Kok implements Runnable{

	
	private Restaurant restaurant;
	private SecureRandom sr = new SecureRandom();
	
	public Kok(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(sr.nextInt(2001));
				restaurant.zetOrderKlaar(new Order());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
		
	}

}
