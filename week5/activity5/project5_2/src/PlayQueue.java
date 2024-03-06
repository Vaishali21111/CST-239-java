
import java.util.Iterator;
import java.util.LinkedList; 
import java.util.Queue;


public class PlayQueue {
	
	public static void main (String []args ) {
		
		
		//Set up a queue of Strings
		Queue<String> stringQueue = new LinkedList<String>();
		//insert an element into the head of the queue 
		stringQueue.offer("Mark Reha");
		stringQueue.offer("Mary Reha");
		stringQueue.offer("Justine Reha");
		stringQueue.offer("rianna Reha");
		
		
		//Setup a queue of integers 
		Queue<Integer> integerQueue = new LinkedList<Integer>();
		integerQueue.add(1);
		integerQueue.offer(-1);
		integerQueue.add(5);
		integerQueue.offer(10);
		
		//print out size and head element of the queue 
		System.out.println(integerQueue); 
		System.out.printf("Integer Queue Tests : size is %d anh haed element is %d\n", integerQueue.size(), integerQueue.peek());
		
		//use Iterator to get elements from the queue 
		Iterator<String> itr = stringQueue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
