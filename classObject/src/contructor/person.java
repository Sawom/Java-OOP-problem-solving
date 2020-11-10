package contructor;  /// create object , method , constructor
public class person {
	String name;
	String gender;
	int age;
	
	person(){
		System.out.println("No value...");
	}
	
	person(String name,String gender,int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	void display() {
		System.out.println("name = "+name);
		System.out.println("gender = "+gender);
		System.out.println("age = "+age);
	}
	
}
