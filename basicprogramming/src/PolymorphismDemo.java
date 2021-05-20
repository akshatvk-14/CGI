
public class PolymorphismDemo {
	public static void main(String[] args) {
		Bank obj = null;
		int choice = 2;
		
		//Take choice input from user
		
		if(choice == 1) {
			obj = new SavingAc();
			obj.getInterestRate();
			((SavingAc)obj).getInterestRate();
		} else {
			obj = new CurrentAc();
			((CurrentAc)obj).show();
		}
		
		obj.getName(); // Compile time binding -- early binding
		obj.withdraw(1000); // Runtime binding -- late binding
	}
}
