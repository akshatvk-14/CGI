
public class IncomeTaxCalc {
	public static void main(String[] args) {
		int income = 1200000;
		int tax = 0;

		if (income <= 250000) {
			tax = 0;
		} else if (income <= 500000) {
			tax = (int) ((income - 250000) * 0.05);
		} else if (income <= 1000000) {
			tax = (int) (12500 + (income - 500000) * 0.20);
		} else {
			tax = (int) (112500 + (income - 1000000) * 0.30);
		}
		
		System.out.println(tax);
	}
}
