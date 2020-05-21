import java.util.ArrayList;

public class List implements Iterable<Integer> {
	private int[] table;
	private int size;
	private ArrayList<ListObserver> observers = new ArrayList<ListObserver>();
	
	public List() {
		table = new int[4];
		size = 0;
	}
	
	public void subscribe(ListObserver observer) {
		observers.add(observer);
	}
	
	public void add(int value) {
		if (size == table.length) {
			int[] oldTable = table;
			table = new int[oldTable.length * 2];
			for (int i = 0; i < oldTable.length; i++)
				table[i] = oldTable[i];
		}
		table[size] = value;
		size++;
		for (ListObserver obs : observers) {
			obs.elementAdded(value, size);
		}
	}
	
	public int size() {
		return size;
	}
	
	public int get(int index) {
		return table[index];
	}
	
	public void set(int index, int value) {
		if (index >= size)
			throw new ArrayIndexOutOfBoundsException(index);
		table[index] = value;
	}
	
	public ListIterator iterator() {
		return new ListIterator(this);
	}
}
