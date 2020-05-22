package misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorProgram {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(8);
        numbers.add(4);

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            int x = it.next();
            System.out.println(x);
        }

        for (int x : numbers) {
            System.out.println(x);
        }
    }

    public void printIterator(Iterable<Integer> numbers) {
        for (int x : numbers) {
            System.out.println(x);
        }
    }
}
