package week2_milestone;

//this a child class for the salableProduct class 
//this is the constructor for this class 
//THIS is a weapon product is a description for all the weapon products 

public class Weapon extends SalableProduct{
public Weapon(String name, int price, int quantity) {
	super(name,"this is an Weapon product",price,quantity);
}
}