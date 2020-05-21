import java.util.ArrayList;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(8);
        numbers.add(4);
        numbers.add(1);
        numbers.add(9);
        numbers.add(7);

        numbers.stream()
        	.filter(x -> x > 5)
    		.map(x -> x * x)
    		.forEach(x -> System.out.println(x));

		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Aksel", 29, 190));
		persons.add(new Person("Per", 23, 180));
		persons.add(new Person("Karl", 18, 157));
		persons.add(new Person("Arne", 23, 187));
		persons.add(new Person("Anne", 21, 175));

		persons.stream()
			.filter(p -> p.getAge() >= 20)
			.filter(p -> p.getName().charAt(0) == 'A')
			.sorted((a, b) -> {
				if (a.getHeight() < b.getHeight())
					return -1;
				else if (a.getHeight() > b.getHeight())
					return 1;
				else
					return 0;
			})
			.map(p -> p.getName())
			.forEach(name -> System.out.println(name));
    }
}
