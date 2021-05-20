
public class WorkingWithNumbers {
	private int[] arr;
	private static int index = 0;
	
	public WorkingWithNumbers() {
		arr = new int[10];
	}
	
	public WorkingWithNumbers(int size) {
		arr = new int[size];
	}
	
	public int addNumber(int no) {
		arr[index++] = no;
		return index;
	}
	
	public int searchNumber(int no) throws NumberNotFoundException {
		for(int i = 0; i < index; i++) {
			if(arr[i] == no) {
				return i;
			}
		}
		throw new NumberNotFoundException();
	}
	
}
