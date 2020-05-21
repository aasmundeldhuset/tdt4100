class A {
	public A methodA() { return null; }
}
class B extends A implements G {
	public B methodB(A a) { return null; }
	public G methodG(A a) { return null; }
}
class C implements G {
	public C methodC(G g) { return null; }
	public G methodG(A a) { return null; }
}
interface G {
	public G methodG(A a);
}
public class InheritanceTricks {
	public static void main(String[] args) {
		/*
		A variableA = new B();
		B variableB = new A(); //--
		G variableG1 = new A(); //--
		G variableG2 = new B();
		G variableG3 = new C();
		*/
		
		A variableA = new A();
		B variableB = new B();
		C variableC = new C();
		//variableA.methodA() == variableC.methodC();
		//variableB.methodA().toString();
		//variableB.methodG(new B());
		//variableA = new B();
		
		((B)variableA).methodG(new A());
	}
}
