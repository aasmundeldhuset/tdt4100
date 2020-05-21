package classes;

public class MyArrayListObserver implements IMyArrayListObserver {
	public void numberAdded(int number) {
		System.out.println("Number added: " + number);
	}
	
	public void numberChanged(int index, int oldNumber, int newNumber) {
		System.out.println("Number at index " + index + 
				" changed from " + oldNumber + " to " + newNumber);
	}
}
