
// Is-A Relationship
public class SavingAc extends Bank {
	private String panNo;
	private static double interestRate;
	private static double minBal;

	static {
		interestRate = 0.03;
		minBal = 10000;
	}

	public SavingAc() {
	}

	public SavingAc(String name, String panNo) {
		super(name, 0); // Call super/parent class ctor
		this.panNo = panNo;
	}

	public SavingAc(String name, double amt, String panNo) {
		super(name, amt); // Call super/parent class ctor
		this.panNo = panNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		SavingAc.interestRate = interestRate;
	}

	public static double getMinBal() {
		return minBal;
	}

	public static void setMinBal(double minBal) {
		SavingAc.minBal = minBal;
	}

	// Method Overriding
	@Override
	public int withdraw(double amt) {
		System.out.println("Withdraw() of SavingAc class");
		if ((getBal() - amt) >= minBal) {
			return super.withdraw(amt);
		}
		return 2;
	}

	// Method Overloading
	public boolean deposit(double amt, String panNo) {
		if (amt <= 50000) {
			return deposit(amt);
		} else if (panNo.equals(getPanNo())) {
			return super.deposit(amt);
		}
		return false;
	}

	@Override
	public double calcInterest(short durationInMonths) {
		double interestAmt = getBal() * durationInMonths * getInterestRate() / 100;
		deposit(interestAmt);
		return interestAmt;
	}
}
