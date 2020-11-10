package overriding;
import java.util.Scanner;
public class mainn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter height of  rectangle... ");
		double height = input.nextDouble();
		System.out.println("enter weidth of  rectangle... ");
		double weidth = input.nextDouble();
		
		shape s = new shape();
		s.display();
		s = new rectangle(height,weidth);  ///dynamic memory dispatch
		s.display();    ///mane super class er reference variable diye 
						///sub class er object k refer korbo
		System.out.println("enter height of  tri-angle... ");
		height = input.nextDouble();
		System.out.println("enter weidth of  tri-tangle... ");
		weidth = input.nextDouble();
		
		s = new triangle(height,weidth);
		s.display();
		
	}

}
