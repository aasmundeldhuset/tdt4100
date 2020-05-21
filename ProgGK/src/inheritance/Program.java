package inheritance;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Student("Ola", 20));
		persons.add(new Professor("Anne", 33));
		persons.add(new Consultant("Magne", 28, true));
		persons.add(new Unemployed("Per", 27));
		persons.add(new Person("Karl", 35));
		
		int wageSum = 0;
		for (int i = 0; i < persons.size(); i++) {
			Person person = persons.get(i);
			wageSum += person.getWage();
			System.out.println(person.getWage());
			if (person instanceof Employee) {
				((Employee) person).work();
			}
			if (person instanceof Consultant) {
				System.out.println(((Consultant) person).isSenior());
			}
		}
		System.out.println("Wage sum: " + wageSum);
	}
}
