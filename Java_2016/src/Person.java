public class Person {
	// Access modifier: public, protected, private, (default)
	private String name;
	private int age;
	private double height;

	public Person() {
		name = "Ola";
		age = 25;
		height = 183;
	}

	public Person(String name, int age, double height) {
		this();
		this.name = name;
		setAge(age);
		setHeight(height);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearsUntilRetirement() {
		return 67 - age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height > 0) {
			this.height = height;
		} else {
			throw new IllegalArgumentException(
					"Illegal height (must be positive): "
							+ height
			);
		}
	}
}
