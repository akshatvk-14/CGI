
//Java Bean / POJO - Plain Old Java Object
//Complete class
public abstract class Bank extends Object {
	// Instance Variable
	private int acNo;
	private String name;
	private double bal;

	// Class Variable
	private static int lastAcNo;

	// static block
	static {
		// Write code to read database table
		lastAcNo = 100;
	}

	// No-arg ctor
	public Bank() {
		this("", 0); // Call current class ctor
	}

	public Bank(String name, double bal) {
		this.acNo = lastAcNo++;
		this.name = name;
		this.bal = bal;
	}

	// Class Method
	public static int getLastAcNo() {
		return lastAcNo;
	}

	private static void setLastAcNo(int lastAcNo) {
		Bank.lastAcNo = lastAcNo;
	}

	// Instance Methods
	public int getAcNo() {
		return acNo;
	}

	private void setAcNo(int acNo) {
		this.acNo = acNo;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final double getBal() {
		return bal;
	}

	private void setBal(double bal) {
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "Bank [acNo=" + acNo + ", name=" + name + ", bal=" + bal + "]";
	}

	//Business Logic method
	public boolean deposit(double amt) {
		if (amt >= 0) {
			bal = bal + amt;
			return true;
		}
		return false;
	}

	//concrete methods
	public int withdraw(double amt) {
		System.out.println("withdraw() of bank class");
		if(amt < 0) {
			return -1;
		}
		
		if (getBal() >= amt) {
			setBal(bal - amt);
			return 1;
		}
		return 0;
	}
	
	//Balance, duration and rateOfInterest
	public abstract double calcInterest(short durationInMonths);
}
