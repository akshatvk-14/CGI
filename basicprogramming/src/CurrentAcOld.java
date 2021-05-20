
public class CurrentAcOld extends Bank{
	//Overdraft limit - 40000/-
	//bal - 10000/-
	//withdraw - 30000/-
	//getBal()=> 10000/-.... super.withdraw(10000)
	//remainingOverdraftlimit = 20000/- & bal=0
	//withdraw - 10000/-
	//remainingOverdraftlimit = 10000/- & bal=0
	//withdraw - 3000/-
	//remainingOverdraftlimit = 7000/- & bal=0
	
	//deposit - 8000/-
	//remainingOverdraftLimit = 15000/- & bal=0
	//deposit - 30000/-
	//remainingOverdraftlimit = 40000/- & bal=5000/-
	
	private double remainingOverdraftLimit;
	
	
	public void show() {
		System.out.println("shpw()");
	}
	
	@Override
	public boolean deposit(double amt) {
		System.out.println("deposit() of CurrentAc class");
		return true;
	}
	
	@Override
	public int withdraw(double amt) {
		System.out.println("withdraw() of CurrentAc class");
		return 0;
	}
}
