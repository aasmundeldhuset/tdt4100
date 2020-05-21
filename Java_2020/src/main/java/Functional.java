import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Functional {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(9);
		numbers.add(-4);
		numbers.add(3);
		
		printModified(numbers, Functional::twice);
		printModified(numbers, Functional::square);
	}
	
	public static int square(int x) {
		return x * x;
	}
	
	public static Integer twice(Integer x) {
		if (x == null) {
			return null;
		} else {
			return x * 2;
		}
	}
	
	public static void printModified(
			List<Integer> numbers,
			Function<Integer, Integer> func) {
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(func.apply(numbers.get(i)));
		}
	}
	
	public static boolean greater(Integer a, Integer b) {
		return a > b;
	}
	
	public static boolean smaller(Integer a, Integer b) {
		return a < b;
	}
	
	public static void sort(
			List<Integer> numbers,
			BiFunction<Integer, Integer, Boolean> compare) {
		for (int i = 0; i < numbers.size(); i++) {
			for (int j = i + 1; j < numbers.size(); j++) {
				if (compare.apply(numbers.get(i), numbers.get(j))) {
					int temp = numbers.get(i);
					numbers.set(i, numbers.get(j));
					numbers.set(j, temp);
				}				
			}
		}
	}
}
