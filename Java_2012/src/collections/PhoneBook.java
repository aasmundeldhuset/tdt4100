package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
	public static void main(String[] args) {
		Map<String, List<String>> phoneBook = new HashMap<String, List<String>>();
		
		phoneBook.put("Aasmund", new ArrayList<String>());
		phoneBook.put("Ola", new ArrayList<String>());
		phoneBook.get("Aasmund").add("12546457");
		phoneBook.get("Aasmund").add("4356987634");
		phoneBook.get("Ola").add("34567365");
		
		for (String name : phoneBook.keySet()) {
			System.out.println(name);
			for (String number : phoneBook.get(name))
				System.out.println(number);
		}
	}
}
