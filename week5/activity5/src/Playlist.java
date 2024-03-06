
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Playlist  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a list of integers and add elements using add()
		List<Integer> integerList = new ArrayList<Integer>() ;
		integerList.add(Integer.valueOf(10));
		integerList.add(Integer.valueOf(11));
		
		//create a list of Strings and add elements using add()
		List<String> stringList = new ArrayList<String>() ;
		stringList.add("Hello World");
		stringList.add("HI World");
		
		//get First element from list using get () 
		System.out.printf("Integer value : %d\n", integerList.get(0));
		System.out.printf("String value : %s\n", stringList.get(0));
		
		
		//loop over the List using a for loop 
		for (Integer data : integerList) {
			System.out.printf("Integer value :%d\n", data);
		}
		
		//loop over the list using an Iterator 
		Iterator <String> stringIterator = stringList.iterator();
		while(stringIterator.hasNext()) {
			System.out.printf("String value :%s\n", stringIterator.next());
		}
		
		

	}

}
