package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ListAndCollection {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>(Arrays.asList(
			"Nina", "Mohammad", "Maria", "Andreas"));
		System.out.println(findInArrayList(names, "Maria"));
		System.out.println(findInList(names, "Maria"));
		System.out.println(findInCollection(names, "Maria"));
		System.out.println(findInIterable(names, "Maria"));
	}

	public static int findInArrayList(ArrayList<String> strings, String value) {
		for (int i = 0; i < strings.size(); i++) {
			if (Objects.equals(strings.get(i), value)) {
				return i;
			}
		}
		return -1;
	}

	public static int findInList(List<String> strings, String value) {
		for (int i = 0; i < strings.size(); i++) {
			if (Objects.equals(strings.get(i), value)) {
				return i;
			}
		}
		return -1;
	}

	public static boolean findInCollection(Collection<String> strings, String value) {
		for (String string : strings) {
			if (Objects.equals(string, value)) {
				return true;
			}
		}
		return false;
	}

	public static boolean findInIterable(Iterable<String> strings, String value) {
		for (String string : strings) {
			if (Objects.equals(string, value)) {
				return true;
			}
		}
		return false;
	}
}
