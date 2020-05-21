import java.util.Scanner;

public class Methods {
    public static double[] solveQuadratic(double a, double b, double c) {
        double underRoot = b * b - 4 * a * c;
        if (underRoot > 0) {
            double answerOne = (-b + Math.sqrt(underRoot)) / (2 * a);
            double answerTwo = (-b - Math.sqrt(underRoot)) / (2 * a);
            return new double[] {answerOne, answerTwo};
        }
        else if (underRoot == 0) {
            double answer = (-b + Math.sqrt(underRoot)) / (2 * a);
            return new double[] {answer};
        }
        else {
            return new double[0];
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a, b, and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double[] answers = solveQuadratic(a, b, c);
        for (int i = 0; i < answers.length; i++) {
            System.out.println(answers[i]);
        }
    }
}
