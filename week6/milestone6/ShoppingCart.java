package milestone6;


import java.util.ArrayList;
import java.util.List;

public class ShoppingCart<T extends SalableProduct> {
    // Items in the shopping cart
    private List<CartItem<T>> items;
    private int total;

    // Constructor
    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.total = 0;
    }

    // Method to add a product to the cart
    public void addToCart(T product, int quantity) {
        product.purchase(quantity);
        items.add(new CartItem<>(product, quantity));
        total += quantity * product.getPrice();
    }

    // Method to remove from the cart
    public void updateQuantityInCart(T product, int quantity) {
        product.cancelPurchase(quantity); // Undo the purchase of the specified quantity
        for (CartItem<T> item : items) {
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
    public List<CartItem<T>> getCartContents() {
        return new ArrayList<>(items);
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
