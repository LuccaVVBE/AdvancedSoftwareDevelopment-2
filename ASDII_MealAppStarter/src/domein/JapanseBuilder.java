package domein;

public class JapanseBuilder extends MenuBuilder {

	public void prepareDrink() {
		getMenu().setDrink("Japans drankje");
	}

	public void prepareMainCourse() {
		getMenu().setMainCourse("Japanse main course");
	}

	public void prepareSideDish() {
		getMenu().setSide("Japanse side dish");
	}
}
