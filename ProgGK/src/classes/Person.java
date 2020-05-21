package classes;

public class Person {
	private String name;
	private int age;
	private int height;
	
	public Person(String name, int age, int height) {
		this.name = name;
		setAge(age);
		this.height = height;
	}
	
	public void print() {
		System.out.println("Hello, my name is " +
			name + ", and I'm " + age + 
			" years old and " + height +
			" cm tall.");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name != null && !name.equals(""))
			this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0)
			throw new IllegalArgumentException("age");
		this.age = age;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void haveBirthday() {
		this.age = this.age + 1;
	}
	
	public String toString() {
		return "Hello, my name is " +
				name + ", and I'm " + age + 
				" years old and " + height +
				" cm tall.";
	}
}
