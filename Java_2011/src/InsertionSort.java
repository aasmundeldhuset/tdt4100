public class InsertionSort {
	public static void insertionSort(int[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			int j = i; // The position to which we have shifted the element originally located at i
			while (j != 0 && numbers[j - 1] > numbers[j]) {
				int temp = numbers[j - 1];
				numbers[j - 1] = numbers[j];
				numbers[j] = temp;
				j--;
			}
		}
	}
}
