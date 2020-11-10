package contructor;
import java.util.Scanner;
public class mainn {
	public static void main(String[] args) {
		Scanner  input = new Scanner(System.in);
		System.out.println("Enter name of that person...");
		String name = input.next();
		
		System.out.println("Enter gender of that person... ");
		String gender = input.next();
		
		System.out.println("Enter age of that person... ");
		int age = input.nextInt();
		
		person per1 = new person(name,gender,age);
		
		person per2 = new person();
		
		System.out.println("info for person 1...");
		per1.display();
		
		System.out.println("\ninfo for person 2...");
		per2.display();
	}
}
