package classes;

import java.util.Iterator;

public class MyArrayListIterator implements Iterator<Integer> {
	private MyArrayList source;
	private int nextIndex;
	
	public MyArrayListIterator(MyArrayList source) {
		this.source = source;
		this.nextIndex = 0;
	}
	
	public boolean hasNext() {
		return nextIndex < source.size();
	}

	public Integer next() {
		int value = source.get(nextIndex);
		nextIndex++;
		return value;
	}

	public void remove() {
	}
}
