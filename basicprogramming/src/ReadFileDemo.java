import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {
	public static void main(String[] args) {
		File file = new File("myfile.txt");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			int ch = fileReader.read();
			while(ch != -1) {
				System.out.print((char) ch);
				ch = fileReader.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
