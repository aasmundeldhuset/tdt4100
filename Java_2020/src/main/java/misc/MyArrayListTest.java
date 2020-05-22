package misc;

import junit.framework.TestCase;

public class MyArrayListTest extends TestCase {
    public void testNewListShouldBeEmpty() {
        MyArrayList list = new MyArrayList();
        assertEquals(0, list.getSize());
    }

    public void testSizeShouldIncreaseByOneForEachElement() {
        MyArrayList list = new MyArrayList();
        list.add(234.5);
        assertEquals(1, list.getSize());
        list.add(2.9);
        assertEquals(2, list.getSize());
        list.add(-3.4);
        assertEquals(3, list.getSize());
    }

    public void testElementsShouldBeRetrievableWithGet() {
        MyArrayList list = new MyArrayList();
        list.add(234.5);
        list.add(2.9);
        list.add(-3.4);
        assertEquals(234.5, list.get(0));
        assertEquals(2.9, list.get(1));
        assertEquals(-3.4, list.get(2));
    }
}
