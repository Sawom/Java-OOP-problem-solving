package problemShape;
public class circle extends shape {
	circle(double r){
		super(r,r);
	}
	@Override
	 void area() {
		double result = 3.14*dim1*dim2;
		System.out.println("area of circle = "+result);
	 };
}
