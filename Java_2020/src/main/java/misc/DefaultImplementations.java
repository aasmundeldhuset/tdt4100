package misc;

public class DefaultImplementations {
	public static void main(String[] args) {
		J i = new A();
		i.doSomething();
	}
}

interface I {
	default void doSomething() {
		System.out.println("misc.I");
	}
}

interface J {
	default void doSomething() {
		System.out.println("misc.J");
	}
}

class A implements I, J {
	@Override
	public void doSomething() {
		I.super.doSomething();
	}
}
