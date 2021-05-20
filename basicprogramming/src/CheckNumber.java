
public class CheckNumber {
	public static void main(String[] args) {
		int num = 0;
		
		if(num < 0) {
			System.out.println(num + " is negative");
		} else {
			//Nested if
			if(num == 0) {
				System.out.println("number is 0");
			} else {
				System.out.println(num + " is a positivie number");
			}
		}
		
		float no = (float) 44.5;
		
		//=======================
		if(num < 0) {
			System.out.println(num + " is negative");
		} else if(num == 0) {
				System.out.println("number is 0");
		} else {
				System.out.println(num + " is a positivie number");
		}	
	}
}
