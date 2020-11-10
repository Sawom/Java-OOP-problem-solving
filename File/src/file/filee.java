package file; /// read from a file
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class filee{
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:\\java files\\File\\read.txt");
		Scanner input = new Scanner(file);
		
		while(input.hasNext()) {
			String s = input.nextLine();
			System.out.println(s);
		}
	}
}