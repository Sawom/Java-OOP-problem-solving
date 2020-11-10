package Encapsulation;
public class person {
	private String name;
	private int age;
	
	person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void display() {
		System.out.println("Name =  "+getName() );
		System.out.println("Age =  "+getAge() );
	}
}
