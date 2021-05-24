package misc;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Calculation
        double[] x = solveQuadratic(434.8, a, c);

        // Output
        System.out.println("There are " + x.length + " answers");
    }

    public static double[] solveQuadratic(double a, double b, double c) {
        double underRoot = b * b - 4 * a * c;
        double[] x;
        if (underRoot > 0) {
            double root = Math.sqrt(underRoot);
            double x1 = (-b + root) / (2 * a);
            double x2 = (-b - root) / (2 * a);
            x = new double[2];
            x[0] = x1;
            x[1] = x2;
        } else if (underRoot == 0) {
            x = new double[1];
            x[0] = -b / (2 * a);
        } else {
            x = new double[0];
        }
        return x;
    }
}
