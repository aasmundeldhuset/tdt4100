import java.util.Iterator;


public class RangeIterator implements Iterator<Integer> {
	private int start;
	private int end;
	private int current;
	
	public RangeIterator(int start, int end) {
		this.start = start;
		this.end = end;
		this.current = start - 1;
	}
	
	public boolean hasNext() {
		return current < end - 1;
	}

	public Integer next() {
		if (!hasNext())
			throw new RuntimeException();
		current++;
		return current;
	}

	public void remove() {
		throw new RuntimeException();
	}

}
