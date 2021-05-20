package regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
	public static void main(String[] args) {
		// IN91 OP234-1234/44/RT
		// [A-Z]{2}[0-9]{2} [A-Z]{2}\\d{2}-[0-9]{4}/[0-9]{2}/[A-Z]{2}
		Pattern ptr = Pattern.compile("\\[");
		Matcher matcher = ptr.matcher("[");
		
		if(matcher.find()) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
		
		if(matcher.matches()) {
			System.out.println("Matches");
		} else {
			System.out.println("Not matches");
		}
	}
}
