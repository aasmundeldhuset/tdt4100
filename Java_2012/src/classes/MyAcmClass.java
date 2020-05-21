package classes;

public class MyAcmClass {
	private int number;
	
	public MyAcmClass() {
		number = 42;
	}
	
	public void init() {
		System.out.println("Init: " + number);
		number *= 2;
	}
	
	public void run() {
		System.out.println("Run: " + number);
	}
}
