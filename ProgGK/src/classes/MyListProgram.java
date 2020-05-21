package classes;

public class MyListProgram {
	public static void main(String[] args) {
		MyList list = new MyList();
		System.out.println(list.getSize());
		list.add(3.2);
		list.add(8);
		list.add(0);
		list.add(7);
		list.add(2);
		for (int i = 0; i < list.getSize(); i++) {
			System.out.println(list.getElement(i));
		}
	}
}
