package inheritance;

public class Professor extends Person implements Employee {
	public Professor(String name, int age) {
		super(name, age);
	}
	
	public int getWage() {
		return 500000 + getAge() * 10000;
	}
	
	public void work() {
		System.out.println("Lecturing");
	}
}
