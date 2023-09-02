package domein;

import java.util.Objects;

public class KinderMenu {

	private final String hamburger;
	private final String drank;
	private final String dessert;
	private final String geschenk;
	
	private KinderMenu(Builder builder) {
		hamburger = builder.hamburger;
		drank = builder.drank;
		dessert = builder.dessert;
		geschenk = builder.geschenk;
	}

//	public void setHamburger(String hamburger) {
//		this.hamburger = hamburger;
//	}
//
//	public void setDrank(String drank) {
//		this.drank = drank;
//	}
//
//	public void setDessert(String dessert) {
//		this.dessert = dessert;
//	}
//
//	public void setGeschenk(String geschenk) {
//		this.geschenk = geschenk;
//	}
//
	public String getHamburger() {
		return hamburger;
	}

	public String getDrank() {
		return drank;
	}

	public String getDessert() {
		return dessert;
	}

	public String getGeschenk() {
		return geschenk;
	}

	@Override
	public String toString() {
		return String.format("KinderMenu: hamburger=%s, drank=%s, dessert=%s, geschenk=%s%n",
				 hamburger, drank, dessert, geschenk);
	}
	
	public static class Builder {
		private String hamburger;
		private String drank;
		private String dessert;
		private String geschenk;
		
		public Builder hamburger(String h) {
			hamburger = h;
			return this;
		}
		public Builder drank(String h) {
			drank = h;
			return this;
		}
		public Builder dessert(String h) {
			dessert = h;
			return this;
		}
		public Builder geschenk(String h) {
			geschenk = h;
			return this;
		}
		
		public KinderMenu build() {
			if(isValid(hamburger) && isValid(drank) && isValid(dessert) && isValid(geschenk))
			return new KinderMenu(this);
			throw new IllegalArgumentException();
		}
		
		private boolean isValid(String x) {
			if(Objects.isNull(x) || x.isBlank()) {
				return false;
			}
			return true;
		}
		
	}

	
}
