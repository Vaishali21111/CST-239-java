package milestone7;

public class CartItem<T extends SalableProduct> {

    private T product;
    private int quantity;

    public CartItem(T product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public T getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
