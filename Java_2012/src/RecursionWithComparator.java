import java.util.Comparator;

// We didn't 
public class RecursionWithComparator {
	public static void main(String[] args) {
		double[] numbers = {4.8, 9.02, 1.2, 3.5, -3.7};
		sort(numbers, new DoubleComparator());
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
	}
	
	public static int findSmallestIndex(double[] numbers, int startAt, Comparator<Double> comp) {
		int smallestIndex = startAt;
		for (int i = startAt + 1; i < numbers.length; i++) {
			if (comp.compare(numbers[i], numbers[smallestIndex]) < 0)
				smallestIndex = i;
		}
		return smallestIndex;
	}
	
	public static void sort(double[] numbers, Comparator<Double> comp) {
		sort(numbers, 0, comp);
	}
	
	public static void sort(double[] numbers, int startAt, Comparator<Double> comp) {
		if (startAt >= numbers.length - 1)
			return;
		else {
			// Find the smallest number in our part of the list,
			// and put it first.
			int smallestIndex = findSmallestIndex(numbers, startAt, comp);
			double temp = numbers[startAt];
			numbers[startAt] = numbers[smallestIndex];
			numbers[smallestIndex] = temp;
			
			sort(numbers, startAt + 1, comp);
		}
	}
	
	
	
	
	
	
	
	public static int factorial(int n) {
		if (n == 1)
			return 1;
		else {
			int smallerFactorial = factorial(n - 1);
			return smallerFactorial * n;
			//return factorial(n - 1) * n;
		}
	}
}
