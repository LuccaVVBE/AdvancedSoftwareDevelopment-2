package domein;

public class MenuDirector {

	private MenuBuilder builder;

	public MenuDirector(MenuBuilder menuBuilder) {
		builder = menuBuilder;
	}

	public void buildMenu() {
		builder.createNewMenu();
		builder.prepareDrink();
		builder.prepareMainCourse();
		builder.prepareSideDish();
	}

	public Menu getMenu() {
		return builder.getMenu();
	}
}
