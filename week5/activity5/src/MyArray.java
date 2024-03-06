

public class MyArray {
	public <E> void printArray(E[] inputArray) {
		//Iterate over the array and print each element 
		for (E element : inputArray) {
			System.out.printf("%s", element);
		}
		
	}
	
	public static void main(String[] args) {
		//create arrays of integer , double and character 
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1 , 2.2 ,3.3 , 4.4 }; 
		Character[] charArray = { 'H', 'E' , 'L', 'L','O'};
		
		
		//print each array out 
		MyArray ma = new MyArray() ;
		System.out.println("Array integerArray contains:"); 
		ma.printArray(intArray); //pass an integer array 
		System.out.println("Array integerArray contains:"); 
		ma.printArray(doubleArray); //pass a double array
		System.out.println("Array characterArray contains:"); 
		ma.printArray(charArray); //pass a Character array
		
		
	}

}
