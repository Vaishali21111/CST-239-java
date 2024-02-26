package milestone3;

public class CartItem {

    private SalableProduct product;
    private int quantity;

    public CartItem(SalableProduct product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

  

	public SalableProduct getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}