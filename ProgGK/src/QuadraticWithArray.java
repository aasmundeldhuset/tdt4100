import java.util.Scanner;

public class QuadraticWithArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = sc.nextDouble();
		System.out.print("Enter b: ");
		double b = sc.nextDouble();
		System.out.print("Enter c: ");
		double c = sc.nextDouble();
		sc.close();
		
		double disc = Math.pow(b, 2) - 4 * a * c;

		double[] result;
		if (disc > 0) {
			result = new double[2];
			result[0] = (-b + Math.sqrt(disc)) / (2 * a);
			result[1] = (-b - Math.sqrt(disc)) / (2 * a);
		}
		else if (disc == 0) {
			result = new double[1];
			result[0] = -b / (2 * a);
		}
		else {
			result = new double[0];
		}
		
		System.out.println(result.length + " result(s)");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
