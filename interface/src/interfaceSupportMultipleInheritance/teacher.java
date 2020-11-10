package interfaceSupportMultipleInheritance;
public class teacher implements person,students {
	public void display() {
		System.out.println("this is from teacher  class...");
	}
	
	//multiple interface e 1ta method ekbar e use kora jay , method overloading hoy na
	/// nicer ta different method nam
	public void display2() {
		System.out.println("ALSO this is from teacher  class...");
	}
}
