package overriding;
public class rectangle extends shape {
	 public double height;
	 public double weidth;
	 
	 public rectangle(double height,double weidth) {
		 this.height=height;
		 this.weidth=weidth;
	 }
	
	 @Override
	 public double area() {
		 return height*weidth;
	 }
	 
	 @Override
	 public void display() {
		 System.out.println("area of rectangle = "+area() );
		 
	 }
	 
}
