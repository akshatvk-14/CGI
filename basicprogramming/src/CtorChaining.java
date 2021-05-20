
class A {
	public A() { System.out.println("A class ctor"); }
}

class B extends A {
	public B() { super(); System.out.println("B class ctor"); }
}

class C extends B{
	public C() { super(); System.out.println("C class ctor"); }
}

public class CtorChaining {
	public static void main(String[] args) {
		C obj = new C();
		
		System.out.println("-----------------------");
		B o = new B();
	}
}
