
public class Recursion {
	public static void main(String[] args) {
		double[] numbers = {4.8, 9.02, 1.2, 3.5, -3.7};
		sort(numbers);
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
	}
	
	public static int findSmallestIndex(double[] numbers, int startAt) {
		int smallestIndex = startAt;
		for (int i = startAt + 1; i < numbers.length; i++) {
			if (numbers[i] < numbers[smallestIndex])
				smallestIndex = i;
		}
		return smallestIndex;
	}
	
	public static void sort(double[] numbers) {
		sort(numbers, 0);
	}
	
	public static void sort(double[] numbers, int startAt) {
		if (startAt >= numbers.length - 1)
			return;
		else {
			// Find the smallest number in our part of the list,
			// and put it first.
			int smallestIndex = findSmallestIndex(numbers, startAt);
			double temp = numbers[startAt];
			numbers[startAt] = numbers[smallestIndex];
			numbers[smallestIndex] = temp;
			// Then, sort the rest of the list.
			sort(numbers, startAt + 1);
		}
	}
	
	public static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return factorial(n - 1) * n;
	}
}
