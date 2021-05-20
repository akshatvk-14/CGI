
public class NextClass {
	//instance variable
	private int no = 100;
	//class variable
	private static int data = 200;
	
	//class method
	public static void main(String[] args) {
		int num = 999; // local variable
		System.out.println("Data - " + data);
		
		NextClass obj = new NextClass();
		obj.no = 300;
		System.out.println("obj.No - " + obj.no);
		
		NextClass obj2 = new NextClass();
		obj2.no = 600;
		System.out.println("obj2.No - " + obj2.no);
		
		System.out.println("NextClass.data -  " + NextClass.data);
		System.out.println("obj.data - " + obj.data);
		System.out.println("obj2.data - " + obj2.data);
		
		NextClass.data = 2000;
		System.out.println("NextClass.data -  " + NextClass.data);
		System.out.println("obj.data - " + obj.data);
		System.out.println("obj2.data - " + obj2.data);		
	}	
	
}
