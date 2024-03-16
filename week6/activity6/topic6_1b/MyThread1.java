package topic6_1b;

public class MyThread1 extends Thread{
	//thread that extends the thread class 
	
	public void run()
	{   
		//override the run()
		for (int x=0 ; x<1000 ; x++) {
			System.out.println("MyThread1 is running iteration " + x);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
