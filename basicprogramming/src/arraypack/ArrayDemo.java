package arraypack;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 300;
		arr[1] = 250;
		arr[2] = 500;
		arr[3] = 100;
		arr[4] = 50;
		
		Arrays.sort(arr);
		int foundAt = Arrays.binarySearch(arr, 250);
		System.out.println("250 found at => " + foundAt);
		
		
		Emp[] empObj = new Emp[4];
		empObj[0] = new Emp(100, "Harish", "New Delhi");
		empObj[1] = new Emp(99, "Mahesh", "New Delhi");
		empObj[2] = new Emp(101, "Veena", "Mumbai");
		empObj[3] = new Emp(98, "Aakash", "Chennai");

		X[] obj = new X[2];
		obj[0] = new X(100);
		obj[1] = new X(102);
		
		Arrays.sort(empObj);
		for(Emp emp : empObj) {
			System.out.println(emp);
		}
		
		foundAt = Arrays.binarySearch(empObj, new Emp(100, "Harish", "Kolkata"));
		System.out.println("Emp found at => " + foundAt);
	}
}
