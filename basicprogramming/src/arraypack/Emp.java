package arraypack;

public class Emp implements Comparable{
	private int empNo;
	private String name;
	private String city;
	
	public Emp() {
		
	}

	public Emp(int empNo, String name, String city) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.city = city;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", name=" + name + ", city=" + city + "]";
	}

	@Override
	public int compareTo(Object o) {
		Emp emp = (Emp) o;
		
//		if(this.getEmpNo() > emp.getEmpNo()) {
//			return 1;
//		} else if(this.getEmpNo() < emp.getEmpNo()){
//			return -1;
//		}
//		
//		return 0;
		
		return this.getName().compareTo(emp.getName());
	}
}
