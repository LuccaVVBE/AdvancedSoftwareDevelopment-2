package domein;

import java.util.*;

public class Waitress {

	private List<Menu> menus;

	private PancakeHouseMenu pancakeHouseMenu;

	public Waitress(List<Menu> list) {
		menus = list;
	}
	// TODO nieuwe attributen en constructor

	public void printMenu() {
		// TODO 
		menus.stream().map(x->x.createIterator()).forEach(this::printMenu);
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println();
		menus.forEach(menu-> {
			System.out.printf("%s%n", menu.getTitle());
			printMenu(menu.createIterator());
		});

	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}


}