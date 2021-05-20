
public class FirstProgram {
	public static void main(String[] args) {
		int noOfLocations = 100;
		int multipleBy = 2;

		int result = noOfLocations * multipleBy;

		multipleBy = 4;
		
		if (result >= 500) {
			System.out.println("First Result " + result);
		} else {
			System.out.println("result is less than 500");
		}
		
		result = noOfLocations * multipleBy;
		System.out.println("New Result " + result);
	}
}

