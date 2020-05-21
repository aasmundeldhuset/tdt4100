import java.util.List;

public class ArrayTasks {
	public int[] countFrequencies(String str) {
		int[] frequencies = new int[26]; 
		for (int i = 0; i < str.length(); ++i) {
			char c = str.charAt(i);
			if ('a' <= c && c <= 'z')
				frequencies[c - 'a']++;
			else if ('A' <= c && c <= 'Z')
				frequencies[c - 'A']++;
		}
		return frequencies;
	}
	
	boolean areAnagrams(String str1, String str2) {
		int[] frequencies1 = countFrequencies(str1);
		int[] frequencies2 = countFrequencies(str2);
		
		for (int i = 0; i < 26; i++) {
			if (frequencies1[i] != frequencies2[i])
				return false;
		}
		return true;
	}
	
	public Object[] reverser1(Object[] tabell) {
		Object[] resultat = new Object[tabell.length];
		for (int i = 0; i < tabell.length; ++i) {
			resultat[i] = tabell[tabell.length - 1 - i];
		}
		return resultat;
	}
	
	public void reverser2(List liste) {
		for (int i = 0; i < liste.size() / 2; ++i) {
			int swapPosition = liste.size() - 1 - i;
			Object right = liste.get(swapPosition);
			Object left = liste.get(i);
			liste.set(swapPosition, left);
			liste.set(i, right);
		}
	}
	
	public boolean isPalindrome(String str) {
		for (int i = 0; i < str.length() / 2; ++i) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	public String swapChars(String str, int p1, int p2) {
		String start = str.substring(0, p1);
		char first = str.charAt(p1);
		String middle = str.substring(p1 + 1, p2);
		String last = str.substring(p2, p2 + 1);
		String end = str.substring(p2 + 1, str.length());
		return start + last + middle + first + end;
	}
}
