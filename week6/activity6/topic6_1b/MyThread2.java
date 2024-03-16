package topic6_1b;

public class MyThread2 implements Runnable {
	//thread that implements the runnable class
	public void run()
	{   
		//override the run()
		for (int x=0 ; x<1000 ; x++) {
			System.out.println("MyThread2 is running iteration " + x);
		}
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}

