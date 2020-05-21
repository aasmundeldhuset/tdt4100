
public class MyObserver implements ListObserver {
	
	public static void main(String[] args) {
		List list = new List();
		list.add(42);
		list.subscribe(new MyObserver());
		list.add(3);
		list.add(9);
		list.set(0, 23);
		list.subscribe(new MyObserver());
		list.add(42);
	}

	public void elementAdded(int addedValue, int newSize) {
		System.out.println("Element with value " + addedValue + 
				" was added; new size is " + newSize);	
	}
}
