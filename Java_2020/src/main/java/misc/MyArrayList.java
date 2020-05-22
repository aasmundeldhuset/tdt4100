package misc;

public class MyArrayList {
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
    }

    public double get(int index) {
        //if (index < used) {
            return values[index];
//        } else {
//
//        }
    }
}
