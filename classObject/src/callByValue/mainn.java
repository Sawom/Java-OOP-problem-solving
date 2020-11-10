package callByValue;
public class mainn {
	public static void main(String[] args) {
		callByvalue call = new callByvalue();
		int x=10;
		System.out.println("before calling...."+x);
		
		call.change(x);
		System.out.println("after calling...."+x);
	}
}
