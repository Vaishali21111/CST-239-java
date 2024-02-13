
public class SalableProduct {
	
	private String name; 
	private String description; 
	private int price; 
	private int quantity; 
	
	
	//constructor 
	public SalableProduct(String name , String description , int price , int quantity) {
		this.name= name;
		this.description= description ; 
		this.price= price ; 
		this.quantity= quantity;
	}
	
	//getters
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
	
	// setter 
	public void setQuantity(int quantity) {
		this.quantity= quantity; 
	}
	
	//methods 
	
	//purchase: verify if i have enough quantity of the product to purchase if yes then update the quantity of my product 
	public void purchase(int quantityToPurchase) {
		if(  quantityToPurchase <= quantity) {
			System.out.println("Product purchased"); 
			quantity= quantity- quantityToPurchase;
		}else {
			System.out.println("Not ENOUGH"); 
		}
	}
	
	// cancel purchase : update the quantity of the product if i choose to cancel a product 
	public void cancelPurchase(int quantityToCancel) {
		System.out.println("canceled purchase"); 
		quantity= quantity+ quantityToCancel;
	}

}
