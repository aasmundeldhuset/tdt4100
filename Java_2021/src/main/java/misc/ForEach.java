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

		for (int number : numbers) {
			System.out.println(number);
		}

		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
