package streams;

import misc.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
//        List<Integer> numbers = List.of(3, 8, 4, 1, 9, 7);
//
//        int result = numbers.stream()
//        	.filter(x -> x > 5)
//    		.map(x -> x * x)
//			.reduce(0, (x, y) -> x * x + y);

		List<Person> persons = List.of(
			new Person("Anne", 29, 190),
			new Person("Per", 23, 180),
			new Person("Supriya", 18, 157),
			new Person("Arne", 13, 187),
			new Person("Kari", 21, 175));

		List<String> result = persons.stream()
			.filter(p -> p.getAge() >= 18)
			.map(p -> p.getName())
			.filter(n -> n.length() == 4)
			.collect(Collectors.toList());

		List<String> res = new ArrayList<>();
		for (Person p : persons) {
			if (p.getAge() >= 18) {
				String name = p.getName();
				if (name.length() == 4) {
					res.add(name);
				}
			}
		}

		for (String p : result) {
			System.out.println(p);
		}
    }

    public static boolean test(Person person) {
    	return person.getAge() >= 18;
	}
}
