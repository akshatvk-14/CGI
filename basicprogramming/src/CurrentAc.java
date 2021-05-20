
public class CurrentAc extends Bank {
	private double overdraftLimit;
	private double overdraftRemaininig;

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftRemaininig() {
		return overdraftRemaininig;
	}

	private void setOverdraftRemaininig(double overdraftRemaininig) {
		this.overdraftRemaininig = overdraftRemaininig;
	}

	@Override
	public boolean deposit(double amt) {
		if((amt + overdraftRemaininig) > overdraftLimit) {
			double remamt = amt - (overdraftLimit - overdraftRemaininig);
		    overdraftRemaininig = overdraftLimit;
		    return super.deposit(remamt);
		}
		
		if (amt > 0 && ((overdraftRemaininig + amt) < overdraftLimit)) {
			setOverdraftRemaininig(amt + overdraftRemaininig);
			return true;
		} else if (overdraftRemaininig == overdraftLimit) {
			return super.deposit(amt);
		} 
		return false;
	}
	
	@Override
	public int withdraw(double amt) {
		if (getBal() < amt && (amt - getBal()) <= overdraftRemaininig) {
			setOverdraftRemaininig(overdraftRemaininig - amt);
			return super.withdraw(0);
		} else if (getBal() < amt && (amt - getBal()) >= overdraftRemaininig) {
			return 2;
		}
		return super.withdraw(amt);
	}

	@Override
	public double calcInterest(short durationInMonths) {
		return 0;
	}
}
