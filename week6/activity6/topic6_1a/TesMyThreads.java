package topic6_1a;

public class TesMyThreads {
	public static void main(String args[]) {
		
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
		Runnable runnable = new MyThread2 () ;
		Thread thread2 = new Thread(runnable);
		thread2.start(); 		
		
	}

}