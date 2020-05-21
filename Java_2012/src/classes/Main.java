package classes;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add(42);
		list.add(3);
		list.add(9);
		printIterator(list.iterator());
		for (int x : list) { // Because MyArrayList implements Iterable, we can use it in a foreach loop
			System.out.println(x);
		}
		
		list.addObserver(new MyArrayListObserver());
		list.add(7);
		list.set(2, 5);
	}
	
	public static void printIterator(Iterator<Integer> iter) {
		while (iter.hasNext()) {
			int value = iter.next();
			System.out.println(value);
		}
	}
}
