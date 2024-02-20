

public class SalableProduct {
	
	private String name; 
	private String description; 
	private int price; 
	private int quantity; 
	
	public SalableProduct(String name , String description , int price , int quantity) {
		this.name= name;
		this.description= description ; 
		this.price= price ; 
		this.quantity= quantity;
	}
	
	public String getName() {
		return name; 
	}
	
	public String getDescription() {
		return description; 
	}
	public int getPrice() {
		return price; 
	}
	public int getQuantity() {
		return quantity; 
	}
	
	
	public void setQuantity(int quantity) {
		this.quantity= quantity; 
	}
	
	public void purchase(int quantityToPurchase) {
		if(  quantityToPurchase <= quantity) {
			System.out.println("Product "+ this.getName() + " , Quantity purchased " + quantityToPurchase); 
			quantity= quantity- quantityToPurchase;
		}else {
			System.out.println("Not enough Quantity to purchase"); 
		}
	}
	
	public void cancelPurchase(int quantityToCancel) {
		System.out.println("canceled purchase"); 
		quantity= quantity+ quantityToCancel;
	}

}
