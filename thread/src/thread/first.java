package thread;   //basic thread
public class first {
	public static void main(String[] args)throws InterruptedException{
		program p = new program();
		p.start();
		for(int i=1;i<=10;i++) {
			System.out.println("29");
			Thread.sleep(1100);
		}
	}	
}
class program extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("69");
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}