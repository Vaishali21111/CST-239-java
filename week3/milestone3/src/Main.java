

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create a StoreFront instance
        StoreFront store = new StoreFront();

        // Initialize the store with products
        store.initializeStore();

        // Create an array of Weapon products
        Weapon weapon6 = new Weapon("weapon6", 150, 15);
        Weapon weapon3 = new Weapon("weapon3", 120, 20);
        Weapon weapon4 = new Weapon("weapon4", 200, 12);
        
        //create an array which has all the weapons 
        Weapon[] weapons = {weapon6, weapon3, weapon4};

        // Sort the array of weapons using Comparable 
        Arrays.sort(weapons);

        // Display the sorted array of weapons
        System.out.println("Sorted Weapons:");
        for (Weapon weapon : weapons) {
            System.out.println(weapon.getName());
        }

        // Purchase some products (5 items from weapon 3 and 8 items from weapon 4) 
        store.purchaseProduct(weapon3, 5);
        store.purchaseProduct(weapon4, 8);

        // Cancel a purchase
        store.CancelPurchaseProduct(weapon3, 2);

        // Display current shopping cart contents
  
        List<CartItem> cartContents = store.getShoppingCart().getCartContents();
        System.out.println("Current Shopping Cart Contents:");
        for (CartItem item : cartContents) {
            System.out.println("Product: " + item.getProduct().getName() + ", Quantity: " + item.getQuantity());
        }
        
    }
}
