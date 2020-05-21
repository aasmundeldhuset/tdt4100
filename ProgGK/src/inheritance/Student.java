package inheritance;

public class Student extends Person {
	public Student(String name, int age) {
		super(name, age);
	}
	
	public int getWage() {
		return 80000;
	}
}
