//Choice -
//1 - Saving Ac
//2 - Current Ac
//3 - FD
//4 - RD
//5 - Loan

public class CheckEquals {
	public static void main(String[] args) {
		int choice = 3;

		if (choice == 1) {
			System.out.println("Saving Ac...");
		} else if (choice == 2) {
			System.out.println("Current Ac...");
		} else if (choice == 3) {
			System.out.println("FD...");
		} else if (choice == 4) {
			System.out.println("RD...");
		} else if (choice == 5) {
			System.out.println("Loan...");
		} else {
			System.out.println("Incorrent choice...");
		}

		switch (choice) {
		case 1:
			System.out.println("Saving Ac");
			break;
		case 2:
			System.out.println("Current Ac");
			break;
		case 3:
			System.out.println("FD");
			break;
		case 5:
			System.out.println("Loan");
			break;
		case 4:
			System.out.println("RD");
			break;
		default:
			System.out.println("Incorrect choice");
		}
	}
}
