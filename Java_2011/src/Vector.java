import java.io.IOException;

public class Vector {
	private double x;
	private double y;
	
	private static int count;
	
	public static final Vector nullVector = new Vector();
	
	public Vector() {
		this(0, 0);
	}
	
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
		count++;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double length() {
		return Math.sqrt(x * x + y * y);
	}
	
	public static int getCount() {
		return count;
	}
	
	public Vector divide(double divisor) throws IOException {
		if (divisor == 0.0)
			throw new IOException("Cannot divide by zero");
		return new Vector(x / divisor, y / divisor);
	}
}
