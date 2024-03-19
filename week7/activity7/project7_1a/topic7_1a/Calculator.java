package topic7_1a;

public class Calculator {
	// add method
	public int add(int a, int b) {
		return a+b ;
	}
	//subtract method
	public int subtract(int a , int b) {
		return a-b;
	}
	//multiply method
	public int multiply (int a , int b) {
		return a*b;
	}
	//divide method
	public int divide(int a , int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator ();
		System.out.println("Adding 1+2 is : "+ calc.add(1, 2));
		System.out.println("Substracting 2 from 1 is "+ calc.subtract(2,1));
		System.out.println("Multiplication of 10 and 2 is "+ calc.multiply(10,2));
		System.out.println("Division of 10 by 2 is " + calc.divide(10,2));
		
	}

}
