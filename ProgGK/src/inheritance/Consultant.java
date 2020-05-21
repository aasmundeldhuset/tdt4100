package inheritance;

public class Consultant extends Person implements Employee {
	private boolean senior;
	
	public Consultant(String name, int age, boolean senior) {
		super(name, age);
		this.senior = senior;
	}
	
	public int getWage() {
		if (senior)
			return 600000;
		else
			return 400000;
	}

	public boolean isSenior() {
		return senior;
	}
	
	public String toString() {
		return "A Consultant called " + getName() + " that is " +
				getAge() + " years old and is " +
				(senior ? "senior" : "junior");
	}
	
	public void work() {
		System.out.println("Programming");
	}
}
