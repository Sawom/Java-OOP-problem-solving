package problemShape;
import java.util.Scanner;
public class mainn {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	// for rectangle
	System.out.println("enter height of  rectangle... ");
	double dim1 = input.nextDouble();
	System.out.println("enter weidth of  rectangle... ");
	double dim2 = input.nextDouble();
	
	shape sh;
	sh = new rectangle(dim1,dim2);
	sh.area();
	
	// for tri-angle
	System.out.println("enter height of  triangle... ");
	dim1 = input.nextDouble();
	System.out.println("enter weidth of  triangle... ");
	dim2 = input.nextDouble();
	
	sh = new triangle(dim1,dim2);
	sh.area();
	
	//for circle
	System.out.println("enter radious of circle... ");
	double r = input.nextDouble();
	
	sh = new circle(r);
	sh.area();
	
	System.out.println("end...");
	}
}
