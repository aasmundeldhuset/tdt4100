package classes;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList implements Iterable<Integer> {
	private int[] numbers;
	private int used;
	private static int numberOfLists;
	private ArrayList<IMyArrayListObserver> observers = new ArrayList<IMyArrayListObserver>();
	
	public MyArrayList() {
		numbers = new int[4];
		used = 0;
		numberOfLists++;
	}
	
	public void addObserver(IMyArrayListObserver observer) {
		observers.add(observer);
	}
	
	public void removeObserver(IMyArrayListObserver observer) {
		observers.remove(observer);
	}
	
	public static int getNumberOfLists() {
		return numberOfLists;
	}
	
	public int size() {
		return used;
	}
	
	public int get(int index) {
		return numbers[index];
	}
	
	public void add(int number) {
		if (this.used == this.numbers.length) {
			int[] newNumbers = new int[this.numbers.length * 2];
			for (int i = 0; i < this.numbers.length; i++)
				newNumbers[i] = this.numbers[i];
			this.numbers = newNumbers;
		}
		
		this.numbers[this.used] = number;
		this.used++;
		
		for (IMyArrayListObserver observer : observers) {
			observer.numberAdded(number);
		}
	}
	
	public void set(int index, int number) {
		int oldNumber = this.numbers[index];
		this.numbers[index] = number;
		
		for (IMyArrayListObserver observer : observers) {
			observer.numberChanged(index, oldNumber, number);
		}
	}
	
	public String toString() {
		String result = "";
		for (int i = 0; i < size(); i++) {
			result += numbers[i] + " ";
		}
		return result.substring(0, result.length() - 1);
	}

	public Iterator<Integer> iterator() {
		return new MyArrayListIterator(this);
	}
}
