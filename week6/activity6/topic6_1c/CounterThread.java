package topic6_1c;

import java.util.Random;

public class CounterThread extends Thread{
	
	public void run () {
		 // sleep this thread for a random amount, increment the counter and exit this thread 
		try {
			Random rand = new Random();
			int sleeper = rand.ints(1,(1000+1)).findFirst().getAsInt();
			Thread.sleep(sleeper);
			}catch(InterruptedException e)
		{
				e.printStackTrace();
		}
		Counter.increment();
	}

}
