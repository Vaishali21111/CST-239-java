package test;



import org.junit.Assert;
import org.junit.Test;

import topic7_1a.Calculator;

public class CalculatorTest {

	@Test
	//testadd to test the add method 
	public void testAdd() {
		Calculator calc = new Calculator();
		//comparing the output
		Assert.assertEquals(3, calc.add(2,1));
		Assert.assertEquals(7, calc.add(5,2));
		
		}

	@Test
	public void testSubtract() {
		//testSubtract to test the subtract method 
		Calculator calc = new Calculator();
		//comparing the output
		Assert.assertEquals(1, calc.subtract(2,1));
		Assert.assertEquals(3, calc.subtract(5,2));
	}

	@Test
	public void testMultiply() {
		//testMultiply to test the multiply method 
		Calculator calc = new Calculator();
		//comparing the output
		Assert.assertEquals(2, calc.multiply(2,1));
		Assert.assertEquals(10, calc.multiply(5,2));
	}

	@Test
	public void testDivide() {
		//testDivide to test the divide method 
		Calculator calc = new Calculator();
		//comparing the output
		Assert.assertEquals(2, calc.divide(2,1));
		Assert.assertEquals(2, calc.divide(5,2));
	}

}