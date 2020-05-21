package iterators;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        MyArrayList my = new MyArrayList();
        my.add(98);
        my.add(2);
        my.add(7);
        printIterable(my);
        
        RangeIterator it = new RangeIterator(50, 100);
        printIterator(it);
        System.out.println("Done");
        printIterator(it);
        System.out.println("Done");
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(42);
        numbers.add(3);
        numbers.add(9);
        printIterable(numbers);
        
        LinkedList<Integer> moreNumbers = new LinkedList<Integer>();
        moreNumbers.add(4);
        moreNumbers.add(18);
        printIterable(moreNumbers);
        
        HashSet<Integer> evenMoreNumbers = new HashSet<Integer>();
        evenMoreNumbers.add(5);
        evenMoreNumbers.add(8);
        printIterable(evenMoreNumbers);
    }
    
    public static void printIterable(Iterable<Integer> iterable) {
//        Iterator<Integer> it = iterable.iterator();
//        while (it.hasNext()) {
//            int number = it.next();
//            System.out.println(number);
//        }
        
        // This foreach loop corresponds to the above while loop
        for (Integer number : iterable) {
            System.out.println(number);
        }
    }
    
    public static void printIterator(Iterator<Integer> it) {
        while (it.hasNext()) {
            int number = it.next();
            System.out.println(number);
        }
    }
}
