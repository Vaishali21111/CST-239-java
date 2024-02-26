package milestone3;

public class Armor extends SalableProduct {

	// the armor class will inherit the salable product class
	//This is the constructor for the armor class
		
	//"this is an armor" is the description for all the armor products 
		public Armor(String name,int price , int quantity) {
			super(name, "THis is an Armor", price , quantity);
			
		}

	}