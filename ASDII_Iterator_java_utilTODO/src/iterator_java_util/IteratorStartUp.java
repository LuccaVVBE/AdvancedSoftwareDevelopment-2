package iterator_java_util;

import java.util.Collections;
import java.util.List;

import domein.CafeMenu;
import domein.DinerMenu;
import domein.PancakeHouseMenu;
import domein.Waitress;

public class IteratorStartUp {
	public static void main(String args[]) {

		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		
		Waitress waitress = new Waitress(List.of(pancakeHouseMenu, dinerMenu, new CafeMenu()));

		waitress.printMenu();

	}
}
