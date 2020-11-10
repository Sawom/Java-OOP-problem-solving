package overriding;
public class triangle extends shape {
	public double height;
	 public double weidth;
	 
	 public triangle(double height,double weidth) {
		 this.height=height;
		 this.weidth=weidth;
	 }
	
	 @Override
	 public double area() {
		 return .5*height*weidth;
	 }
	 
	 @Override
	 public void display() {
		 System.out.println("area of rectangle = "+area() );
		 
	 }
	
	
}
