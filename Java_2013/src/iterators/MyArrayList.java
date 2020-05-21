package iterators;

import java.util.Iterator;

public class MyArrayList implements Iterable<Integer> {
    private int[] numbers;
    private int used;
    
    public MyArrayList() {
        numbers = new int[4];
        used = 0;
    }
    
    public Iterator<Integer> iterator() {
        return new MyArrayListIterator(this);
    }
    
    public int size() {
        return used;
    }
    
    public int get(int index) {
        return numbers[index];
    }
    
    public void add(int number) {
        if (this.used == this.numbers.length) {
            int[] newNumbers = new int[this.numbers.length * 2];
            for (int i = 0; i < this.numbers.length; i++)
                newNumbers[i] = this.numbers[i];
            this.numbers = newNumbers;
        }
        
        this.numbers[this.used] = number;
        this.used++;
    }
    
    public void set(int index, int number) {
        this.numbers[index] = number;
    }
}
