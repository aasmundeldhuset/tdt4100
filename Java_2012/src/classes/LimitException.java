package classes;

public class LimitException extends Exception {
	private int min;
	private int max;
	
	public LimitException(int min, int max) {
		super("Invalid limits: min = " + min + ", max = " + max);
		this.min = min;
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}
}
