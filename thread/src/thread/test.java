package thread;  /// extending thread class
public class test extends Thread {
	public static void main(String[] args) {
		Thread t1 = new test();
		Thread t2 = new test();
		t1.start();
		t2.start();
		System.out.println ("Main completed");
	}
	
	public void run() {
		for (int i = 0;i<5; i ++) {
			System.out.println( Thread.currentThread().getName()+":"+i);
				try {
					Thread.sleep (200);
				} catch (InterruptedException e){
					e.printStackTrace();
			}			
		}
	}
}
