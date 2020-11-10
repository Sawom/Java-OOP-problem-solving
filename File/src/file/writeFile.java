package file;               //write from a file name and id
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
public class writeFile {
	public static void main(String[] args)  {
		String name ,id;
		try {
			Formatter format = new Formatter("D:\\java files\\File\\write.txt");
			Scanner input = new Scanner(System.in);
			System.out.println("how many students.......");
			int num = input.nextInt();
			for(int i =0;i<num;i++) {
				System.out.println("input name.......");
				name=input.next();
				System.out.println("input id.......");
				id=input.next();
				format.format("%s  %s\n", name,id);
				System.out.printf("%s  %s\n", name,id);
			}
		format.close();		
		} catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
