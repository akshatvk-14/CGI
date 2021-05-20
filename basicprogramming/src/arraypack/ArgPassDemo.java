package arraypack;

class X implements Comparable{
	private int num;
	
	public X() {	
	}
	
	public X(int num) {
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
		return "X [num=" + num + "]";
	}
	
	public int compareTo(Object o) {
		X obj = (X) o;
		
		if(this.getNum() > obj.getNum()) {
			return 1;
		} else if(this.getNum() < obj.getNum()) {
			return -1;
		}
		return 0;
	}
}

class WorkingWithArgs {
	public void workingWithInt(int no) {
		no = 100;
		System.out.println("no - " + no);
	}
	
	public void workingWithObj(X o) {
		o = new X();
		o.setNum(100);
	}
}

public class ArgPassDemo {
	public static void main(String[] args) {
		int num = 99;
		
		WorkingWithArgs argObj = new WorkingWithArgs();
		System.out.println("Before passing, num - " + num); // 99
		argObj.workingWithInt(num);
		System.out.println("After num - " + num); // 99
		System.out.println(" ============================================= ");
		
		X obj = new X();
		obj.setNum(99);
		System.out.println("X object num - " + obj.getNum()); // 99
		argObj.workingWithObj(obj);
		System.out.println("X object num - " + obj.getNum()); // 99
	}
}
