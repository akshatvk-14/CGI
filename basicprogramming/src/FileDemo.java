import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		FileWriter fileWrite = null;
		
		try {
			fileWrite = new FileWriter("myfile.txt", true);
			fileWrite.write("\nWe are experising Java");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileWrite.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
