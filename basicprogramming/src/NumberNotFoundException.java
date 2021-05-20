
public class NumberNotFoundException extends Exception{

	@Override
	public String getMessage() {
		return "Number is not available";
	}	
}
