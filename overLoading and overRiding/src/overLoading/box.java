package overLoading;
public class box {
	double height;
	double width;
	double dept;
	
	box(double height,double width,double dept){
		this.height=height;
		this.width=width;
		this.dept=dept;
	}
	
	box(double len){
		height=width=dept=len;
	}
	
	public double area(){
		return height*width*dept;
	}
	
	public static void main(String[] args) {
		box b1=new box(5,10,15);
		System.out.println("box1 area "+b1.area());
		
		box b2=new box(5);
		System.out.println("box2 area "+b2.area());
	}
}
