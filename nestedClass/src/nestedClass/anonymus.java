package nestedClass;   /// anonymus class
class test{
	void display() {
		System.out.println("display from test,,,,");
	}
}
public class anonymus {
	public static void main(String[] args) {
		
		test an = new test() {
			@Override
			void display(){
				System.out.println("display from anonymus class,,,,");
			}
		};
		an.display();
	}
}
