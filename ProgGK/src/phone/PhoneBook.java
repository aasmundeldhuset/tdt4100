package phone;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
	private HashMap<String, PhoneBookEntry> book = new HashMap<String, PhoneBookEntry>();
	
	public PhoneBook() {
	}
	
	public void addNumber(String name, String number) {
		PhoneBookEntry entry = book.get(name);
		if (entry == null) {
			entry = new PhoneBookEntry(name);
			book.put(name, entry);
		}
		entry.addNumber(number);
	}
	
	public ArrayList<String> search(String name) {
		PhoneBookEntry entry = book.get(name);
		if (entry == null)
			return new ArrayList<String>();
		else
			return entry.getNumbers();
	}
}
