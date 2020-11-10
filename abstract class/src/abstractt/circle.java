package abstractt;
public class circle extends shape {
	circle(double r){
		super(r,r);
	}
	
	void area() {
		double result = Math.PI *dim1*dim2;
		System.out.println("area of rectangle = "+result);
	}
}
