package abstractt;
public class area {
	public static void main(String args[]) {
		shape sha ;
		sha = new rectangle(6,10);
		sha.area();
		
		sha = new triangle(20,10);
		sha.area();
		
		sha = new circle(20);
		sha.area();
		
		
	}
}
