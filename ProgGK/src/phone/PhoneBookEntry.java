package phone;

import java.util.ArrayList;

public class PhoneBookEntry {
	private String name;
	private ArrayList<String> numbers;
	
	public PhoneBookEntry(String name) {
		this.name = name;
		this.numbers = new ArrayList<String>();
	}
	
	public void addNumber(String number) {
		numbers.add(number);
	}
	
	public int getNumberCount() {
		return numbers.size();
	}
	
	public String getNumber(int index) {
		return numbers.get(index);
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<String> getNumbers() {
		return new ArrayList<String>(numbers); // Return a copy of the list; otherwise, the encapsulation is broken because the caller may modify the returned list
	}
}
