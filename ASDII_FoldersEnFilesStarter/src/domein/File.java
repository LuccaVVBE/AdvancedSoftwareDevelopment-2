package domein;

import java.util.Iterator;

public class File extends AbstractFile {

	private int kbytes;

	public File(String name, int kbytes) {
		super(name);
		setKBytes(kbytes);
	}

	public void print(int level) {
		String indent = "";
		for (int i = 0; i < level; i++) {
			indent += "\t";
		}
		System.out.println(indent + getName() + " (" + getKBytes() + " kb)");
	}

	public int getKBytes() {
		return kbytes;
	}

	private void setKBytes(int bytes) {
		this.kbytes = bytes;
	}

	public Iterator<AbstractFile> createIterator() {
		return new NullIterator();
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return true;
	}
}
