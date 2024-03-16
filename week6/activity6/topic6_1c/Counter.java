package topic6_1c;

public class Counter {
	// static counter that starts at zero 
	
	static int count =0 ; 
	
	//increment the counter 
	static synchronized void increment () {
		count = count + 1; 
	}
	// get the counter value 
	
	static int getCount()
	{
		return count;
	}


}
