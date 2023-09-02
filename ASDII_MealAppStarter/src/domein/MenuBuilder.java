package domein;

public abstract class MenuBuilder {

	private Menu menu;

	public Menu getMenu() {
		return this.menu;
	}

	public void createNewMenu() {
		menu = new Menu();
	}

	public abstract void prepareDrink();

	public abstract void prepareMainCourse();

	public abstract void prepareSideDish();
}
