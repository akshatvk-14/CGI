import java.util.ArrayList;
import java.util.List;

class Test {
	private int num;
	public Test() {
	}
	public Test(int num) {
		super();
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Test [num=" + num + "]";
	}
}

public class ListDemo {
	public static void main(String[] args) {
		List<String> elements = new ArrayList<String>();
		elements.add("Hello");
		elements.add("Monday");
		elements.add("Hell");
		elements.add("Monda");
		elements.add("Hel");
		elements.add("Mond");
		elements.add("He");
		elements.add("Mon");
		System.out.println("elements - " + elements);
		
		List<Test> testElements = new ArrayList<Test>();
		testElements.add(new Test(4));
		testElements.add(new Test(40));
		testElements.add(new Test(400));
		
		System.out.println("testElements - " + testElements);
	}
}
