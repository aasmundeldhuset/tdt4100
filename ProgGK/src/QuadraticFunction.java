import java.util.ArrayList;
import java.util.Scanner;

public class QuadraticFunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		double a = sc.nextDouble();
		System.out.print("Enter b: ");
		double b = sc.nextDouble();
		System.out.print("Enter c: ");
		double c = sc.nextDouble();
		sc.close();
		
		ArrayList<Double> result = solveQuadratic(a, b, c);
		
		System.out.println(result.size() + " result(s)");
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	
	public static ArrayList<Double> solveQuadratic(double a, double b, double c) {
		double disc = Math.pow(b, 2) - 4 * a * c; // The number under the square root
		ArrayList<Double> result = new ArrayList<Double>();
		if (disc > 0) {
			result.add((-b + Math.sqrt(disc)) / (2 * a));
			result.add((-b - Math.sqrt(disc)) / (2 * a));
		}
		else if (disc == 0) {
			result.add(-b / (2 * a));
		}
		return result;
	}
}
