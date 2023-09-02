package domein;

import java.util.Iterator;
import java.util.*;

public abstract class AbstractFile {

	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public abstract void print(int level);

	public int getKBytes() {
		throw new UnsupportedOperationException();
	}

	public void add(AbstractFile obj) {
		throw new UnsupportedOperationException();
	}

	public AbstractFile(String name) {
		setName(name);
	}

	public abstract Iterator<AbstractFile> createIterator();
	
	public abstract boolean isLeaf();
}
