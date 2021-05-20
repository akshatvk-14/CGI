package finalpack;

final class PublicClass {
	public final void show() {
		final int TOTAL_NO = 100;
//		TOTAL_NO = 99;
		System.out.println("no - " + TOTAL_NO);
	}
	
	//Method overloading
	public void show(int no) {
		System.out.println("show(int no) is executing ...");
	}
}

class SubClass extends PublicClass {
	public void show() {
		System.out.println("no - " + TOTAL_NO);
	}
	
	public void show(int a, int b) {
		final int TOTAL_NO = 100;
//		TOTAL_NO = 99;
		System.out.println("no - " + TOTAL_NO);
	}
}

public class FinalDemo {
	public static void main(String[] args) {
		PublicClass obj = new PublicClass();
		obj.show();
		
		final Test testObj = new Test();
		testObj.setNo(999);
		
		testObj = new Test();
		
		final int num;
		System.out.println("Hello - ");
		num = 99;
		num = 888;
	}
}

class Test {
	private int no = 100;
	public Test() {
		
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "Test [no=" + no + "]";
	}
}
