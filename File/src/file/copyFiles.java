package file;          //copied from one file to another
import java.io.File;
import java.nio.file.Files;
public class copyFiles {
	public static void main(String[] args) {
		File old = new File("D:\\java files\\File\\read.txt");
		File New = new File("D:\\java files\\File\\backup.txt");
		
		try {
			Files.copy(old.toPath(), New.toPath());
		} 
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Done.....");
	}
}
