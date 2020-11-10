package Inheritence;
public class car extends vechile {
	private int weight;
	
	car(String name,String color,int weight) {
		super(name,color);
		this.weight=weight;
	}
	
	public void setweight(int weight) {
		this.weight=weight;
	}
	public int getweight() {
		return weight;
	}
	
	@Override
	void display() {
		super.display();
		System.out.println("Weight = "+getweight() );
	}
	
}
