package classes;

public class Vector {
	private double x;
	private double y;
	
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector() {
	}
	
	public Vector add(Vector v) {
		return new Vector(this.getX() + v.getX(),
						  this.getY() + v.getY());
	}
	
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
}
