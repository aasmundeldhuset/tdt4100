package misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(42);
		numbers.add(3);
		numbers.add(9);

		Iterable<Integer> iterable = numbers;
		Iterator<Integer> iterator = iterable.iterator();
		while (iterator.hasNext()) {
			Integer boxed = iterator.next();
			int number = boxed.intValue();
			System.out.println(number);
		}

		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
