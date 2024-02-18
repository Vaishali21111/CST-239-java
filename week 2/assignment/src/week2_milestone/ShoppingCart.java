package week2_milestone;

public class ShoppingCart {

	private int total=0; 
	
	
	
	public void addToCart(SalableProduct product , int quantity) {
		product.purchase(quantity);
		int price= product.getPrice();
		total= total+ quantity*price; 
		
	}
	
	public void removeFromTheCart(SalableProduct product , int quantity) {
		product.cancelPurchase(quantity);
		int price= product.getPrice();
		total= total - quantity*price; 
		
	}
	
	public int checkout() {
		return total ; 
	}
	
	

}
