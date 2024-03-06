

public class MyNumbersArray {
	public <E extends Number> void printArray(E[] inputArray)
	{
		//iterate over the array and print each element 
		for (E element : inputArray)
		{
			System.out.printf("%s", element);
		}
		
	}
	
	public static void main(String[] args) {
		//create arrays of integer , double and character 
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1 , 2.2 ,3.3 , 4.4 }; 
		//will not accept character so I changed with float 
		Float[] floatArray = { 0.0f, 1.0f , 2.5f, 3.5f};
		
		
		//print each array out 
		MyNumbersArray ma = new  MyNumbersArray() ;
		System.out.println("Array integerArray contains:"); 
		ma.printArray(intArray); //pass an integer array 
		System.out.println("Array integerArray contains:"); 
		ma.printArray(doubleArray); //pass a double array
		System.out.println("Array floatArray contains:"); 
		ma.printArray(floatArray); //pass a Character array
		
		
	}
}
