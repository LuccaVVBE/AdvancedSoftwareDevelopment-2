package domein;

import java.util.Iterator;

public abstract class MenuComponent {
    private String name;
    private String description;
    
    
    public MenuComponent(String name, String description) {
		// TODO Auto-generated constructor stub
    	this.name= name;
    	this.description = description;
	}

	public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

	public abstract void print();

	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	public void add(java.lang.Object menuComponent) {
		throw new UnsupportedOperationException();
	}

	public void remove(java.lang.Object menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public abstract boolean isLeaf();

	public abstract Iterator<domein.MenuComponent> createIterator();
}