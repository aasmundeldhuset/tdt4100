package phone;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookProgram {
	public static void main(String[] args) {
		PhoneBook book = new PhoneBook();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("S: Search; N: New number; X: Exit?");
			String action = sc.next();
			if (action.equalsIgnoreCase("s")) {
				System.out.println("Name: ");
				String name = sc.next();
				ArrayList<String> numbers = book.search(name);
				System.out.println(numbers.size() + " numbers:");
				for (int i = 0; i < numbers.size(); i++) {
					System.out.println("  " + numbers.get(i));
				}
			}
			else if (action.equalsIgnoreCase("n")) {
				System.out.println("Name: ");
				String name = sc.next();
				System.out.println("Number: ");
				String number = sc.next();
				book.addNumber(name, number);
			}
			else if (action.equalsIgnoreCase("x")) {
				break;
			}
		}
		sc.close();
	}
}
