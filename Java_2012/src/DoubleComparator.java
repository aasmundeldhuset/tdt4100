import java.util.Comparator;


public class DoubleComparator implements Comparator<Double> {
	public int compare(Double a, Double b) {
		a = Math.abs(a);
		b = Math.abs(b);
		if (a < b)
			return 1;
		else if (a > b)
			return -1;
		else
			return 0;
	}
}
