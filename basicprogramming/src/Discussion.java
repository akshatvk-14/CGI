
public class Discussion {
	public static void main(String[] args) {
		Bank b = new SavingAc();
		
		if (b instanceof Bank) {
			System.out.println("b instanceof Bank");
		}
		
		if(b instanceof SavingAc) {
			System.out.println("b instanceof SavingAc");
		}
		
		if(b instanceof CurrentAc) {
			System.out.println("b instance of CurrentAc");
		}
	}
}
