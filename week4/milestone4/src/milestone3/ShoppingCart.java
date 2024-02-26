package milestone3;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    //items in the shopping cart are not the same as the salable products 
    private List<CartItem> items;
    private int total;

    // Constructor
    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.total = 0;
    }

    // Method to add a product to the cart
    public void addToCart(SalableProduct product, int quantity) {
        product.purchase(quantity);
        items.add(new CartItem(product, quantity));
        total += quantity * product.getPrice();
    }

    // Method to remove from the cart
    public void updateQuantityInCart(SalableProduct product, int quantity) {
        product.cancelPurchase(quantity); // Undo the purchase of the specified quantity
        for (CartItem item : items) {
            if (item.getProduct().equals(product)) {
                int updatedQuantity = item.getQuantity() - quantity;
                if (updatedQuantity < 0) {
                    updatedQuantity = 0; // Ensure quantity doesn't go negative
                }
                item.setQuantity(updatedQuantity);
                total -= quantity * product.getPrice();
                break; // Exit loop after updating quantity for the specific product
            }
        }
    }

    // Method to return the contents of the shopping cart
    public List<CartItem> getCartContents() {
        return items;
    }

    // Method to return the total price of the cart
    public int checkout() {
        return total;
    }

    // Method to empty the contents of the shopping cart
    public void emptyCart() {
        items.clear();
        total = 0;
    }
}