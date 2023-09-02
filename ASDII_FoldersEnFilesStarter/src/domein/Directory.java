package domein;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class Directory extends AbstractFile {
	private List<AbstractFile> files;

	public Directory(String name) {
		super(name);
		files = new ArrayList<>();
	}

	public void add(AbstractFile obj) {
		files.add(obj);
	}

	public void print(int level) {
		String indent = "";
		for (int i = 0; i < level; i++)
			indent += "\t";
		System.out.println(indent + "Directory : " + getName());
//		level++;
		files.forEach(f -> f.print(level+1));
//		for (Object obj : files) {
//			if (obj instanceof Directory directory)
//				directory.print(level);
//			else
//				((File) obj).print(level);
//		}
	}

	public Iterator<AbstractFile> createIterator() {
		return new CompositeIterator(files.iterator());
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
