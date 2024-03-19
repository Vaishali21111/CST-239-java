package milestone7;


public class SalableProduct implements Comparable<SalableProduct> {
	//atributes 
	private String name; 
	private String description; 
	private int price; 
	private int quantity; 
	
	
	//default constructor 
	public SalableProduct() {
    }
	
	
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
	
	//setter 
	public void setQuantity(int quantity) {
		this.quantity= quantity; 
	}
	
	//purchase: quantity of the product willl be modifies 
	public void purchase(int quantityToPurchase) {
		if(  quantityToPurchase <= quantity) {
			System.out.println("Product "+ this.getName() + " , Quantity purchased " + quantityToPurchase); 
			quantity= quantity- quantityToPurchase;
		}else {
			System.out.println("Not enough Quantity to purchase"); 
		}
	}
//cancel : qunatity of the product will be modified 
	public void cancelPurchase(int quantityToCancel) {
		System.out.println("canceled purchase"); 
		quantity= quantity+ quantityToCancel;
	}
	
	 @Override
	    public int compareTo(SalableProduct other) {
	        // Compare two SalableProducts based on their names
	        return this.getName().compareTo(other.getName());
	    }

}
