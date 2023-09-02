package domein;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Beyonce 
{
	private int aantalKeerGezongen;
	
	private static final Beyonce beyonce = new Beyonce();
	private static final BeyonceImitator imitatorInstance = new BeyonceImitator();
	
	private Beyonce() {
	}

	public void zingEenLied() {
		++aantalKeerGezongen;
		System.out.println("Ik zong "+ aantalKeerGezongen + " keer");
	}
	
	public static Beyonce getInstance() {
		LocalDate nu = LocalDate.now();
		
		return nu.getDayOfWeek().equals(DayOfWeek.FRIDAY) ? imitatorInstance : beyonce;
	}
	
	private static class BeyonceImitator extends Beyonce{
		@Override
		public void zingEenLied() {
			System.out.println("Imitator is aan het zingen");
		}
	}
}
