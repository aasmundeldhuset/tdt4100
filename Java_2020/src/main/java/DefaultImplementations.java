public class DefaultImplementations {
	public static void main(String[] args) {
		J i = new A();
		i.doSomething();
	}
}

interface I {
	default void doSomething() {
		System.out.println("I");
	}
}

interface J {
	default void doSomething() {
		System.out.println("J");
	}
}

class A implements I, J {
	@Override
	public void doSomething() {
		I.super.doSomething();
	}
}
