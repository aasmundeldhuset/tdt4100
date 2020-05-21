
public class Recursion {
    public static void main(String[] args) {
        printRecursive("Heisann");
        System.out.println();
        System.out.println(factorial(5));
    }
    
    public static void printRecursive(String str) {
        if (str.equals(""))
            return;
        printRecursive(str.substring(1));
        System.out.print(str.charAt(0));
    }
    
    public static int factorial(int n) {
        if (n <= 0)
            return 1;
        return n * factorial(n - 1);
    }
}
