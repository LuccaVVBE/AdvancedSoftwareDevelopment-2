package domein;

import java.util.*;

public class PancakeHouseMenuIterator implements Iterator {

	private List<MenuItem> items;
	private int position = 0;

	public boolean hasNext() {
		return position < items.size();
	}

	public Object next() {
		return items.get(position++);
	}

	public PancakeHouseMenuIterator(List<domein.MenuItem> items) {
		this.items = items;
	}
}
