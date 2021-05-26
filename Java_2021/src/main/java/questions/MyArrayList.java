package questions;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList implements Iterable<Double> {
    private double[] values = new double[4];
    private int used;

    public int getSize() {
        return used;
    }

    public void add(double value) {
        if (used == values.length) {
            double[] newValues = new double[2 * values.length];
            for (int i = 0; i < values.length; i++) {
                newValues[i] = values[i];
            }
            values = newValues;
        }
        values[used++] = value;
        // values -> [9, 5, 1, 7, 3, 0, 0, 0]
        // size: 5
    }

    public double get(int index) {
        return values[index];
    }

    @Override
    public Iterator<Double> iterator() {
        return new MyArrayListIterator(this);
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(9);
        list.add(5.2);
        list.add(1);
        list.add(7);
        list.add(3);
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }

        for (double number : list) {
            System.out.println(number);
        }
//        Iterator<Double> it = list.iterator();
//        while (it.hasNext()) {
//            Double number = it.next();
//            System.out.println(number);
//        }
    }
}

class MyArrayListIterator implements Iterator<Double> {
    private final MyArrayList list;
    private int nextIndex;

    MyArrayListIterator(final MyArrayList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return nextIndex < list.getSize();
    }

    @Override
    public Double next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        double number = list.get(nextIndex);
        nextIndex++;
        return number;
    }
}
