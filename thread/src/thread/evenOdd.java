package thread;   /// two thread that print even odd numbers
public class evenOdd {  
	public static void main(String[] args) {
		Thread t1 = new Thread(new even(),"Even numbers...");
		Thread t2 = new Thread(new odd(),"Odd numbers...");
		
		t1.start();
		t2.start();
	}
}

class even extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println (Thread.currentThread().getName()+".."+i);
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class odd extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.println (Thread.currentThread().getName()+".."+i);
			}
		}
	}
	
}