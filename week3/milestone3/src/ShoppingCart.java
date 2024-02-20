
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	
    //items in the shopping cart are not the same as the salable products so i created a new class called CARTITEM
    private List<CartItem> items;
    private int total;

    // Constructor: list of items and total to do the checkout 
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

    // Method to remove a product from the cart
    public void updateQuantityInCart(SalableProduct product, int quantity) {
        product.cancelPurchase(quantity); 
        
        // search for the item in the cart items array 
        for (CartItem item : items) {
        	//if i find the item i will update the quantity  
            if (item.getProduct().equals(product)) {
            	
                int updatedQuantity = item.getQuantity() - quantity;
               // if the qauntity <=0 then i will remove the item from the cart items array else i will just update the quantity 
                if (updatedQuantity <= 0) {
                    items.remove(item);}
                System.out.println(updatedQuantity);
                item.setQuantity(updatedQuantity);
                total -= quantity * product.getPrice();
                break; 
            
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