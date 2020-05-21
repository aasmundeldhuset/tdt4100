interface Animal {
	// Should use System.out.println() to print the animal's noise
	public void makeNoise();
}

class Dog implements Animal {
	public void makeNoise() {
		System.out.println("Bark");
	}	
}

class Cat implements Animal {
	public void makeNoise() {
		System.out.println("Mieow");
	}
}

class Human implements Animal {
	private String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void makeNoise() {
		System.out.println("Hello, my name is " + name);
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Cat cat = new Cat();
		Human human1 = new Human("Aasmund");
		Human human2 = new Human("John");
		dog1.makeNoise();
		dog2.makeNoise();
		cat.makeNoise();
		human1.setName("Ola");
		human1.makeNoise();
		human2.makeNoise();
		
		Animal a1 = dog1;
		Animal a2 = dog2;
		Animal a3 = cat;
		Animal a4 = human1;
		Animal a5 = human2;
		
		a1.makeNoise();
		a2.makeNoise();
		a3.makeNoise();
		a4.makeNoise();
		a5.makeNoise();
		
		a1 = human2;
		a1.makeNoise();
		a1 = null;
	}
}
