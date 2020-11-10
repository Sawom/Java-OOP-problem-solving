package nestedClass;    // local Inner Class // method er vitor class     
public class localInnerClass {
	void show() {
		class test{
			void sum() {
				int a= 21;
				int b= 12;
				int result = a+b;
				System.out.println("result = "+result);
				System.out.println("from sum method...");
			}
		}
		test t = new test();
		t.sum();
		System.out.println("end of show method...");
	}
	
	public static void main(String[] args) {
		localInnerClass lc = new localInnerClass();
		lc.show();
		System.out.println("end main method...");
	}
}
