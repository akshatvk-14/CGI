package packb;

import packa.PublicClass;
import packa.subpacka.TestClass;
import static java.lang.System.out;
import static java.lang.System.in;

public class AccessSpDemo {
	public void access() {
		PublicClass obj = new PublicClass();
		obj.publicMethod();
		obj.protectedMethod();
		obj.defaultMethod();
		obj.privateMethod();
	}
	
	public void testClassObj () {
		TestClass obj = new TestClass();
		out.println("Hello World !!!")
	}
}