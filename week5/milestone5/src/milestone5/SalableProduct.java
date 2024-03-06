package milestone5;

public class SalableProduct implements  Comparable<SalableProduct>{
	//to compare the products I will use the interface comparable 
	
	
	//atributes 
	private String name; 
	private String description; 
	private int price; 
	private int quantity; 
	
	
	//default constructor 
	public SalableProduct() {
    }
	
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
	
	//setter 
	public void setQuantity(int quantity) {
		this.quantity= quantity; 
	}
	
	//purchase: quantity of the product will be modified
	public void purchase(int quantityToPurchase) {
		if(  quantityToPurchase <= quantity) {
			System.out.println("Product "+ this.getName() + " , Quantity purchased " + quantityToPurchase); 
			quantity= quantity- quantityToPurchase;
		}else {
			System.out.println("Not enough Quantity to purchase"); 
		}
	}
//cancel : quantity of the product will be modified 
	public void cancelPurchase(int quantityToCancel) {
		System.out.println("canceled purchase"); 
		quantity= quantity+ quantityToCancel;
	}
	
//override compareTo function to compare two salable products based on  the name and the price 
	@Override
    public int compareTo(SalableProduct other) {
        // First, compare by name
        int nameComparison = this.name.compareTo(other.getName());
        if (nameComparison != 0) {
            return nameComparison; // If names are different, return the result of name comparison
        } else {
            // If names are the same, compare by price
            return Integer.compare(this.price, other.getPrice());
        }
    }

}
