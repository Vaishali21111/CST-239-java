import java.util.List; 
import java.util.ArrayList;

public class ShoppingCart {
	private List<SalableProduct> items = new ArrayList<>(); 
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
