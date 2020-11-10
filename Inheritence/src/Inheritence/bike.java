package Inheritence;
public class bike extends car {
	private int speed;
	 bike(String name, String color, int weight,int speed) {
		super(name, color, weight);
		this.setspeed(speed);
	}
	public int getspeed() {
		return speed;
	}
	public void setspeed(int speed) {
		this.speed = speed;
	}

	@Override
	void display() {
		super.display();
		System.out.println("speed = "+getspeed() );
	}
}
