package problemShape;

public class rectangle extends shape {
	
	rectangle(double dim1,double dim2){
		super(dim1,dim2);
	}
	
	@Override
	 void area() {
		double result = dim1*dim2;
		System.out.println("area of rectangle = "+result);
	 };
}
