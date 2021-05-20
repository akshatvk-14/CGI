
public class ParaDemo {
	public static void main(String[] args) {
		String para = "select * from ipl.csv where season > 2014 and filename = 'abcd.csv'";
		
		String[] words = para.split(" order by | group by ");
		
		for(String word : words) {
				System.out.println(word);				
		}
	}
}
