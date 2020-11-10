package Encapsulation;
import java.util.Scanner;
public class mainn {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your name...");
		String name = input.next();
		System.out.println("Enter your age...");
		int age = input.nextInt();
		
		person per = new person(name,age);
		per.display();
	}

}
