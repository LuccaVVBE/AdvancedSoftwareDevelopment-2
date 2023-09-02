package mealapp;

import domein.ItaliaanseBuilder;
import domein.JapanseBuilder;
import domein.Menu;
import domein.MenuBuilder;
import domein.MenuDirector;

public class MealApp {

   public static void main(String[] args) {
      new MealApp();
   }
   
   public MealApp() {
       
	   
        //TODO
        System.out.printf("menu is: %s%n",     getMenu(new ItaliaanseBuilder())                   );
        
        
        System.out.printf("menu is: %s%n",        getMenu(new JapanseBuilder())                );
    }
   
   private Menu getMenu(MenuBuilder builder) {
	   MenuDirector md = new MenuDirector(builder);
	   md.buildMenu();
	   return md.getMenu();
   }

   
}
