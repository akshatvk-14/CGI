
public class WorkingWithNumberApp {
	public static void main(String[] args) {
		WorkingWithNumbers numbers = new WorkingWithNumbers(5);
		numbers.addNumber(10);
		numbers.addNumber(30);
		try {
			int index = numbers.searchNumber(77);
			System.out.println("Number found at - " + index);
		} catch (NumberNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
