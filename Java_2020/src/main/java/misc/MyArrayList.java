package misc;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList implements Iterable<Double> {
    // values ------> [ 9 5 1 7 3 0 0 0 ]
    // used: 5
    //   ^---------------------------+
    // it -> MyArrayListIterator() list    nextIndex: 5
    private double[] values = new double[4];
    public int used;

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
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(3);

        for (double number : list) {
            System.out.println(number);
        }
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
        double number = list.get(nextIndex);
        nextIndex++;
        return number;
    }
}
