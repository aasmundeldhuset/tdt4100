package streams;

import misc.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(8); // 64
        numbers.add(4);
        numbers.add(1);
        numbers.add(9); // 81
        numbers.add(7); // 49

        int result = numbers.stream()
        	.filter(x -> x > 5)
    		.map(x -> x * x)
			.reduce(0, (x, y) -> x * x + y);

		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Anne", 29, 190));
		persons.add(new Person("Per", 23, 180));
		persons.add(new Person("Supriya", 18, 157));
		persons.add(new Person("Arne", 23, 187));
		persons.add(new Person("Kari", 21, 175));

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
			//.max((a, b) -> Double.compare(a.getHeight(), b.getHeight()))
			//.collect(Collectors.maxBy(Comparator.comparing(Person::getHeight)))
			.map(p -> p.getName())
			.forEach(name -> System.out.println(name));
    }
}
