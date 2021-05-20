
class M {
	public static void show() {
		System.out.println("show() of class M");
	}
}

class N extends M {
	public static void show() {
		System.out.println("show() of N class");
	}
}

public class OverrideDemo {
	public static void main(String[] args) {
		M.show();
		N.show();
	}
}
