import java.util.Iterator;

public class Iterators {
	public static void main(String[] args) {
		List list = new List();
		list.add(4);
		list.add(3);
		list.add(9);
		System.out.println(sum(list.iterator()));
		
		ListIterator it = list.iterator();
		while (it.hasNext()) {
			Integer value = it.next();	
			System.out.println(value);
		}
		
		// Foreach loops get converted by Java into while loops like the one above
		for (Integer value : list) {
			System.out.println(value);
		}
	}
	
	public static int sum(Iterator<Integer> it) {
		int sum = 0;
		while (it.hasNext()) {
			sum += it.next();
		}
		return sum;
	}
}
