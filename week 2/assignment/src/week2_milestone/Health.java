package week2_milestone;

//this a child class for the salableProduct class 
//this is the constructor for this class 
// THIS is a health product is a description for all the health products 

public class Health extends SalableProduct {
	public Health(String name, int price, int quantity) {
		super(name, "this is an Health product", price , quantity);
		
	}

}
