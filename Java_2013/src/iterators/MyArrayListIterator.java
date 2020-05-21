package iterators;

import java.util.Iterator;

public class MyArrayListIterator implements Iterator<Integer> {
    private MyArrayList list;
    private int nextIndex;
    
    public MyArrayListIterator(MyArrayList list) {
        this.list = list;
        this.nextIndex = 0;
    }
    
    public boolean hasNext() {
        return nextIndex < list.size();
    }

    public Integer next() {
        return list.get(nextIndex++);
    }

    public void remove() {
    }
}
