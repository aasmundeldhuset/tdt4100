import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {
    @Test
    public void newListShouldBeEmpty() {
        MyArrayList list = new MyArrayList();
        assertEquals(0, list.getSize());
    }
    
    @Test
    public void sizeShouldIncreaseByOneForEachElement() {
        MyArrayList list = new MyArrayList();
        list.add(234.5);
        assertEquals(1, list.getSize());
        list.add(2.9);
        assertEquals(2, list.getSize());
        list.add(-3.4);
        assertEquals(3, list.getSize());
    }
    
    @Test
    public void addedElementsShouldBeRetrievableWithGet() {
        MyArrayList list = new MyArrayList();
        list.add(234.5);
        list.add(2.9);
        list.add(-3.4);
        assertEquals(234.5, list.get(0));
        assertEquals(2.9, list.get(1));
        assertEquals(-3.4, list.get(2));
    }
}
