
public class CartItem {
  
	//2 attributes 
    private SalableProduct product;
    private int quantity;
     
    
    //this is the constructor 
    public CartItem(SalableProduct product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

  
    //this is the get method to get the product 
	public SalableProduct getProduct() {
        return product;
    }

	
	// method to get the quantity 
    public int getQuantity() {
        return quantity;
    }
    
    //method to set the quantity of the cart item  
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}