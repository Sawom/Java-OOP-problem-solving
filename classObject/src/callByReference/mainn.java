package callByReference;
public class mainn {
	public static void main(String[] args) {
		callByReference call= new callByReference();
		call.a = 99;
		
		System.out.println("before calling...."+call.a);
		
		call.change(call);
		System.out.println("after calling...."+call.a);
	}
}
