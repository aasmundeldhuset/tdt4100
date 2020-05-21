import java.util.Iterator;


public class ListIterator implements Iterator<Integer> {
	private List source;
	private int nextIndex;
	
	public ListIterator(List source) {
		this.source = source;
		this.nextIndex = 0;
	}
	
	public boolean hasNext() {
		return nextIndex < source.size();
	}
	
	public Integer next() {
		return source.get(nextIndex++);
	}
	
	public void remove() {
		throw new RuntimeException();
	}
}
