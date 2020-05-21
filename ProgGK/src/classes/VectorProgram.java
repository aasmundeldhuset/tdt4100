package classes;

public class VectorProgram {
	public static void main(String[] args) {
		Vector a = new Vector(3, 4.7);
		Vector b = new Vector(2, -7.8);
		System.out.println(a);
		System.out.println(b);
		Vector w = a.add(b);
		System.out.println(w); // Note that the output here is [5.0, -3.0999999999999996] - calculations with float or double are almost always imprecise!
	}
	
	public static Vector add(Vector u, Vector v) {
		return new Vector(u.getX() + v.getX(), u.getY() + v.getY());
	}
}
