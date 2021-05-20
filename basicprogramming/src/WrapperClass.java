
public class WrapperClass {
	public static void main(String[] args) {
		String input1 = "22.222";

		try {
			Integer.parseInt(input1);
			System.out.println(input1 + "is a valid integer no");
		} catch (NumberFormatException e) {
			try {
				Double.parseDouble(input1);
				System.out.println(input1 + "is a valid double integer no");
			} catch (NumberFormatException ee) {
				System.out.println(input1 + "is String");
			}
		}
		
		Integer i = 100;
		String str = i.toString();
	}
}
