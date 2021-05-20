
public class StringDemo {
	public static void main(String[] args) {
		String name = "Stackroute niit";
		
		String capName = name.toUpperCase();
		String lowerName = name.toLowerCase();
		char ch = name.charAt(3);
		String address = name.concat("Bangalore");
		
		System.out.println("name - " + name);
		System.out.println("Capital Name - " + capName);
		System.out.println("Lower Name - " + lowerName);
		System.out.println("chat at 3 = " + ch);
		System.out.println("Address - " + address);
		
		if(name.equalsIgnoreCase("stackroute")) {
			System.out.println("name is same as Stackroute");
		} else {
			System.out.println("name is not same as Stackroute");
		}
		
		System.out.println("3 till 7 character - " + name.substring(3, 7));
	}

}
