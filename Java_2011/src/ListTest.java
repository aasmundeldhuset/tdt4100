import junit.framework.TestCase;

public class ListTest extends TestCase {
	public void testAddingMoreNumbersThanInitialCapacity() {
		List list = new List();
		list.add(4);
		list.add(3);
		list.add(9);
		list.add(2);
		list.add(7);
		
		assertEquals(5, list.size());
		assertEquals(4, list.get(0));
		assertEquals(3, list.get(1));
		assertEquals(9, list.get(2));
		assertEquals(2, list.get(3));
		assertEquals(7, list.get(4));
	}
	
	public void testSettingAnIndexAtTheEndOfSize() {
		List list = new List();
		list.add(4);
		list.add(3);
		list.set(1, 42);
		
		assertEquals(42, list.get(1));
	}
	
	public void testSettingAnIndexGreaterThanSizeButSmallerThanCapacity() {
		try {
			List list = new List();
			list.add(4);
			list.add(3);
			list.set(2, 42);
			fail();
		}
		catch (ArrayIndexOutOfBoundsException e) {
		}
	}
	
	public static void main(String[] args) {
		List list = new List();
		list.add(4);
		list.add(3);
		list.add(9);
		list.add(2);
		list.add(7);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
}
