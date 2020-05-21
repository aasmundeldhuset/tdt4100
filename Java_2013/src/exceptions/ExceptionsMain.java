package exceptions;

import java.util.Scanner;

public class ExceptionsMain {
    public static void main(String[] args) {
        // Give -11 or -6 as input to cause exceptions
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        try {
            System.out.println(foo(x));
            System.out.println("Done");
        }
        catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getZ());
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("All done");
    }
    
    public static int foo(int x) {
        return x + 2 * bar(x + 9);
    }
    
    public static int bar(int y) {
        if (y == 3)
            throw new RuntimeException("y can't be 3");
        return y * foobar(2 + y);
    }
    
    public static int foobar(int z) {
        if (z != 0)
            return 100 / z;
        else
            throw new MyException(z);
    }
}
