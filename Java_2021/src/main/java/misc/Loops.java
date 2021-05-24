package misc;

public class Loops {
    public static void main(String[] args) {
        double[] numbers = new double[]{3.4, 8.9, 6.1, 2.7, 5.5};
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
        System.out.println(i);

        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }

        System.out.println("Done");
    }


    public static double sum(double[] numbers) {
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public static int maxIndex(double[] numbers) {
        if (numbers.length == 0) {
            return -1;
        }
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[index]) {
                index = i;
            }
        }
        return index;
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
