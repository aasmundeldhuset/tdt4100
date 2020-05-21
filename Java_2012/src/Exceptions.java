import java.util.Scanner;


public class Exceptions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int x = sc.nextInt();
			
			try {
				System.out.println(a(x));
				System.out.println("Det lyktes");
			}
			catch (RuntimeException e) {
				System.out.println(e.getMessage());
				System.out.println("Det mislyktes - skriv inn et nytt tall");
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Katastrofal feil");
			}
		}
	}
	
	public static int a(int x) throws Exception {
		return 4 + b(x);
	}
	
	public static int b(int x) throws Exception {
		return c(x) * 2;
	}
	
	public static int c(int x) throws Exception {
		if (x == 0)
			throw new Exception("Ikke skriv inn 0!");
		else
			return 100 / x;
	}
}
