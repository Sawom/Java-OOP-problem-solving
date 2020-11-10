package Inheritence;
import java.util.Scanner;
public class mainn {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter car name...");
		String name = input.next();
		System.out.println("Enter car color...");
		String color = input.next();
		System.out.println("Enter car weight...");
		int weight = input.nextInt();
		System.out.println("Enter car speed...");
		int speed = input.nextInt();

		car c = new car(name ,color,weight );
		System.out.println("for car information...");
		c.display();
		
		
		System.out.println("Enter bike name...");
		name = input.next();
		System.out.println("Enter bike color...");
		color = input.next();
		System.out.println("Enter bike weight...");
		weight = input.nextInt();
		System.out.println("Enter bike speed...");
		speed = input.nextInt();

		bike b = new bike(name ,color,weight, speed );
		System.out.println("for bike information...");
		b.display();
		
		System.out.println(c instanceof bike ); /// instanceof keyword
		System.out.println(b instanceof vechile );
		System.out.println(c instanceof vechile );
		System.out.println(c instanceof bike );
		
		System.out.println("...end...");
	}
}
