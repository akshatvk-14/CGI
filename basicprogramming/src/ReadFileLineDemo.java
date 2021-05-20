import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//READ A FILE AND PRINT TOTAL WORDS IN THE FILE
public class ReadFileLineDemo {
	public static void main(String[] args) {
		String s = null;
		int count = 0;
		FileReader file = null;
		BufferedReader br = null;

		try {
			file = new FileReader("filecvasdfasdf.txt");
			br = new BufferedReader(file);

			while ((s = br.readLine()) != null) {
				String ans[] = s.split(" ");
				count += ans.length;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			int result = 2/0;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}
		System.out.println("no of words in a string are-" + count);
		try {
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}