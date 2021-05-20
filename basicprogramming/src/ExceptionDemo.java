
public class ExceptionDemo {
	public static void main(String[] args) {
		int a = 100, b = 0;
		int[] arr = new int[4];
		
		String str = null;
		try {
			System.out.println("Inside try block ....");
			
			int result = a/b;
			System.out.println("Result - " + result);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
			System.out.println("Error - " + ae.getMessage());
		} catch(Exception e) {
			System.out.println("Exception Raised - " + e.getMessage());
		} finally {
			System.out.println("INSIDE FINALLY BLOCK ....");
		}
		System.out.println("End of program....");
	}

}
