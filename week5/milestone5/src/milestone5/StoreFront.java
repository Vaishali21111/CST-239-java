package milestone5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;


public class StoreFront<T extends SalableProduct> {
    // Adding inventory manager to the store front
    private InventoryManager<T> inventoryManager = new InventoryManager<>();

    // Integration of the shopping cart in the store front
    private ShoppingCart<T> shoppingCart = new ShoppingCart<>();
    private String name = "Sunshine store";

    // Initialize store, create products, and add them to the inventory
    public void initializeStore() {
        System.out.println("Welcome to the " + name);
        //read the salable products from the file 
        Map<String, T> inventory = inventoryManager.initializeInventoryFromFile("products.json");
        System.out.println("Products Available");
        // Iterate over each product in the inventory
        for (T product : inventory.values()) {
            // Print product details
            System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() + ", Quantity Available: " + product.getQuantity());
        }
    }

    // Purchase product method, add the product to the shopping cart and update the quantity of the product in the inventory
    public void purchaseProduct(T product, int quantity) {
        shoppingCart.addToCart(product, quantity);
        int newQuantity = product.getQuantity() - quantity;
        inventoryManager.updateInventory(product.getName(), newQuantity);
    }

    // Cancel purchase product method, remove the product from the shopping cart and update the quantity of the product in the inventory
    public void cancelPurchaseProduct(T product, int quantity) {
        shoppingCart.updateQuantityInCart(product, quantity);
        int newQuantity = product.getQuantity() + quantity;
        inventoryManager.updateInventory(product.getName(), newQuantity);
    }

    // Checkout method
    public int checkout() {
        return shoppingCart.checkout();
    }

    // Get product by name method
    public T getProductByName(String name) {
        return inventoryManager.getProductByName(name);
    }

    // Get shopping cart
    public ShoppingCart<T> getShoppingCart() {
        return shoppingCart;
    }

    // Order products in inventory by name and price (ascending or descending)
    public List<T> orderInventoryByNameAndPrice(boolean ascending) {
        List<T> orderedInventory = new ArrayList<>(inventoryManager.getAllProducts());
        Collections.sort(orderedInventory);
        if (!ascending) {
            Collections.reverse(orderedInventory);
        }
        return orderedInventory;
    }
 
}
