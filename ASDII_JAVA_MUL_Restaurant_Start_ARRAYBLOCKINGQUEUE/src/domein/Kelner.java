package domein;

import java.security.SecureRandom;

public class Kelner implements Runnable{

	
	private Restaurant restaurant;
	private SecureRandom sr = new SecureRandom();
	private String naam;
	
	public Kelner(Restaurant restaurant, String naam) {
		this.restaurant = restaurant;
		this.naam = naam;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(sr.nextInt(2001));
				Order order = restaurant.haalOrderOp();
				System.out.printf("Kelner %s heeft order %s opgedient.%n",naam, order);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Thread.currentThread().interrupt(); 
			}
		}
		
	}

}
