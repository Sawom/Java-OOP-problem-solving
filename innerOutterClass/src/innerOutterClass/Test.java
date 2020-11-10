package innerOutterClass;
class outer{
	int x= 69;
	void show() {
		System.out.println("x = "+x);
		
		inner in =new inner();
		in.messege();
		in.print();
	}

	class inner{
		void messege() {
			System.out.println("x = "+x);
			System.out.println("this is inner messege");
		}
		void print() {
			System.out.println("this is inner print");
		}
	}

	void messege() {
		System.out.println("x = "+x);
		System.out.println("this is outter messege \n");
	}
}

public class Test {
	public static void main(String args[]) {
		outer out = new outer();
		outer.inner in = out.new inner();
		
		out.show();
		out.messege();
		
		in.messege();
		in.print();
	}
}
