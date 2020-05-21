package classes;

public class MyList {
	private double[] elements;
	private int used;
	private static int numberOfLists;
	
	public MyList() {
		this.elements = new double[4];
		this.used = 0;
		numberOfLists ++;
	}
	
	public int getSize() {
		return used;
	}
	
	public double getElement(int index) {
		if (index < 0 || index >= used)
			throw new IllegalArgumentException("index");
		return elements[index];
	}
	
	public void add(double element) {
		if (used == elements.length) {
			double[] newElements = new double[elements.length * 2];
			for (int i = 0; i < elements.length; i++) {
				newElements[i] = elements[i];
			}
			elements = newElements;
		}
		System.out.println("Adding element " + element + " at index " + used);
		elements[used] = element;
		used++;
	}
	
	public static int getNumberOfLists() {
		return numberOfLists;
	}
}
