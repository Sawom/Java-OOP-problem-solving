package Inheritence;     /// inherite private member variable,
public class vechile {  /// super keyword , instance of keyword
	private String name;
	private String color;
	
	vechile(String name,String color){
		this.name = name;
		this.color = color;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
	public String getcolor() {
		return color;
	}
	
	void display() {
		System.out.println("Name = "+getName() );
		System.out.println("Color = "+getcolor());
	}
}
