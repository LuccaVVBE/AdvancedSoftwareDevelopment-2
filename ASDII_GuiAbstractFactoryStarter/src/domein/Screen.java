package domein;

import java.util.*;

public class Screen {

	private List<Component> componenten;
	private GuiFactory guifactory;
	
    public Screen(GuiFactory gui) {
        //TODO
    	this.guifactory = gui;
    	componenten = new ArrayList<>();
    }

    public void addButton() {
        //TODO
    	componenten.add(guifactory.createButton());
    }

    public void addLabel() {
        //TODO
    	componenten.add(guifactory.createLabel());
    }

    public void viewComponents() {
        //TODO
    	componenten.forEach(x-> x.show());
    }

	
}
