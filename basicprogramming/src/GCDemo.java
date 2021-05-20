
class TestGC{
	private double data;
	
	public TestGC() { }

	public double getData() { return data; }

	public void setData(double data) { this.data = data; }
	
	@Override
	public String toString() { return "Data - " + data; }

	@Override
	protected void finalize() throws Throwable { System.out.println("finalize() ..............."); }
}

public class GCDemo {
	public static void main(String[] args) {
		for(int i=0; i<1000000; i++) {
			new TestGC();	
		}
//		System.gc();
		System.out.println("Bye ..................");
	}
}
