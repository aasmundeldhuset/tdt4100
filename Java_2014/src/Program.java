import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a, b, and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double underRoot = b * b - 4 * a * c;
        if (underRoot > 0) {
            double answerOne = (-b + Math.sqrt(underRoot)) / (2 * a);
            double answerTwo = (-b - Math.sqrt(underRoot)) / (2 * a);
            System.out.println("The answers are: " + answerOne + " and " + answerTwo);
        }
        else if (underRoot == 0) {
            System.out.println("The answer is: " + (-b / (2 * a)));
        }
        else {
            System.out.println("No answer");
        }
    }
}
