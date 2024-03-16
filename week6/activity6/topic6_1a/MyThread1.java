package topic6_1a;

import java.lang.Thread;

public class MyThread1 extends Thread{
	//thread that extends the thread class 
	
	public void run()
	{   
		//override the run()
		System.out.println("My thread1 is running");
	}
}
