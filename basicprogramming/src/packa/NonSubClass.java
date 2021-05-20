package packa;

public class NonSubClass {
	public void access() {
		PublicClass obj = new PublicClass();
		
		obj.publicMethod();
		obj.protectedMethod();
		obj.defaultMethod();
		obj.privateMethod();
	}
}
