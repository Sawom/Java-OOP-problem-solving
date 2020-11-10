package thread;   //thread runnable interface implements
class JobForThread implements Runnable{
	@Override
	public void run() {
		for (int i = 0;i<5; i ++) {
			System.out.println( Thread.currentThread().getName()+":"+i);
				try {
					Thread.sleep (200);
				} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}	
}
	
public class runnable {
	public static void main(String[] args) {
		Thread t1 = new Thread(new JobForThread(), "1st thread");
		Thread t2 = new Thread(new JobForThread(), "2nd thread");
		
		t1.start();
		t2.start();
		System.out.println ("Main completed");
	}
}