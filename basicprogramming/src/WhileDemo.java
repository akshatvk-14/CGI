
// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10


public class WhileDemo {
	public static void main(String[] args) {
		int no = 1;
		
		for(no=1; no < 100; no++) {
			if(no % 3 == 0) {
				continue;
			}
			System.out.print(no + ", ");
		}
	}
}
