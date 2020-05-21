// This is approximately how programs written with the ACM package work.
public class Acm {
	public static void main(String[] args) {
		Acm program = new Acm();
		program.init();
		program.run();
	}
	
	public void println(Object o) {
		System.out.println(o);
	}
	
	// ACM's code is above the line
	// ---------------
	// Your code is below the line
	
	private int x;
	
	public void init() {
		x = 42;
	}
	
	public void run() {
		System.out.println(x);
	}
}
