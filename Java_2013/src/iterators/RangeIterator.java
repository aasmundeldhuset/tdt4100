package iterators;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {
    private int start;
    private int end;
    private int next;
    
    public RangeIterator(int start, int end) {
        this.start = start;
        this.end = end;
        this.next = start;
    }
    
    public boolean hasNext() {
        return next <= end;
    }

    public Integer next() {
        return next++;
    }

    public void remove() {
    }
}
