package domein;

public class ItaliaanseBuilder extends MenuBuilder {

	public void prepareDrink() {
		getMenu().setDrink("Italiaans drankje");
	}

	public void prepareMainCourse() {
		getMenu().setMainCourse("Italiaans menu");
	}

	public void prepareSideDish() {
		getMenu().setSide("Italiaanse side");
	}
}
