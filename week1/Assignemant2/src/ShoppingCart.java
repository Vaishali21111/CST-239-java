import java.util.List; 
import java.util.ArrayList;

public class ShoppingCart {
	// attributes: list of my salable product and the total of the checkout 
	private List<SalableProduct> items = new ArrayList<>(); 
	private int total=0; 
	
	
	// this the method addtocart , which will call the method purchase identified in salable product class and add the total 
	//price to the total of the checkout 
	public void addToCart(SalableProduct product , int quantity) {
		product.purchase(quantity);
		int price= product.getPrice();
		total= total+ quantity*price; 
		
	}
	
	// this the method removeFromCart , which will call the method cancelpurchase identified in salable product class 
	//and subtract  the total price from  the total of the checkout 
	public void removeFromTheCart(SalableProduct product , int quantity) {
		product.cancelPurchase(quantity);
		int price= product.getPrice();
		total= total - quantity*price; 
		
	}
	// method checkout to return the total of the purchase 
	public int checkout() {
		return total ; 
	}
	
	

}
