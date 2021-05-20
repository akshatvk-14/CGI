
public class BankArrApp {
	public static void main(String[] args) {
		Bank[] arrObj = new Bank[5];
		
		arrObj[0] = new Bank(100, "Harish", 1000);
		arrObj[1] = new Bank(101, "Rajesh", 2000);
		arrObj[4] = new Bank(103, "Meena", 4000);
		arrObj[3] = new Bank(102, "Mahesh", 3000);
		arrObj[2] = new Bank(105, "Prakash", 5000);
		
		for(int i=0; i < arrObj.length; i++) {
			System.out.println(arrObj[i]);
		}
		System.out.println("---------------------");
		for(Bank b : arrObj) {
			System.out.println(b);
		}
		
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 15;
		arr[3] = 12;
		
		for(int data : arr) {
			System.out.println(data);
		}
	}
}
