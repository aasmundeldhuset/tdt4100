package exceptions;

import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class ExceptionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number, or 0 to exit: ");
            int number = sc.nextInt();
            if (number == 0)
                break;
            try {
                int answer = compute(number);
                System.out.println("The answer is " + answer);
            }
            catch (IllegalArgumentException e) {
                System.out.println(number + " is not valid; please enter another number");
            }
            catch (TimeoutException e) {
                System.out.println("Timeout!");
            }
//            catch (Exception e) {
//                System.out.println("Something inexplicable happened!");
//            }
        }
    }
    
    private static int compute(int number) throws TimeoutException {
        return 4 + calculate(number - 7);
    }
    
    private static int calculate(int number) throws TimeoutException {
        if (number != 0)
            return 10 / number;
        else
            throw new TimeoutException("calculate() does not handle " + number);
    }
}
