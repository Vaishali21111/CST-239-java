package milestone5;


import java.util.List;
import java.util.Scanner;

public class User {
	
	private StoreFront<SalableProduct> store; 
	private Scanner scanner; 
	
	public User(StoreFront store) {
		this.store = store;
		this.scanner = new Scanner(System.in);
	}
	
	
	//different actions for the user 
	
	public void displayActions() {
		System.out.println("Welcome, please choose an action:");
		System.out.println("1. Purchase a product");
		System.out.println("2. Cancel a purchase");
		System.out.println("3. Checkout");
		System.out.println("4. Display the contents of the shopping cart"); 
		System.out.println("5. Empty the cart");
		System.out.println("6. Order products in inventory by name and price (ascending)");
		System.out.println("7. Order products in inventory by name and price (descending)");
		
	}
	// interaction 
	public void interact() {
		while(true) {
			displayActions();
			int numberAction = scanner.nextInt();
			scanner.nextLine();
			
			switch(numberAction) {
			case 1:
				purchaseProduct();
				break;
			
			case 2:
				cancelPurchase();
				break;
			
			case 3:
				System.out.println("Total price: " + store.checkout());
				break;
				
			case 4:
				displayContent();
				break;
				
			case 5:
				emptyCart();
				break;
				
			case 6:
				orderInventoryByNameAndPrice(true);
				break;
				
			case 7:
				orderInventoryByNameAndPrice(false);
				break;
				
			
			}
		}
	}
	
	// Purchase product: ask the user to enter the product name and the quantity, then search for the product in the store
	// If it is available, the user can purchase the product.
	public void purchaseProduct() {
		System.out.println("Enter the product name: ");
		String productName = scanner.nextLine();
		System.out.println("Enter the quantity: ");
		int quantity = scanner.nextInt(); 
		scanner.nextLine();
		
		SalableProduct product = store.getProductByName(productName);
		if (product != null) {
			store.purchaseProduct(product, quantity);
		} else {
			System.out.println("Product not found.");
		}
	}
	
	// Cancel purchase: ask to enter the product name and the quantity, then search for the product in the store
	// If it is available, the user can cancel his purchase.
	public void cancelPurchase() {
		System.out.println("Enter the product name: ");
		String productName = scanner.nextLine();
		System.out.println("Enter the quantity: ");
		int quantity = scanner.nextInt(); 
		scanner.nextLine();
		
		SalableProduct product = store.getProductByName(productName);
		if (product != null) {
			store.cancelPurchaseProduct(product, quantity);
		} else {
			System.out.println("Product not found.");
		}
	}
	
	// Display content of the shopping cart.
	public void displayContent() {
		ShoppingCart shoppingCart = store.getShoppingCart();
		List<CartItem> items = shoppingCart.getCartContents();
		System.out.println("Shopping Cart Contents:");
		for (CartItem item : items) {
		    // Print product details
		    System.out.println("Name: " + item.getProduct().getName() + ", Quantity: " + item.getQuantity());
		}
	}
	
	// Empty the cart.
	public void emptyCart() {
		store.getShoppingCart().emptyCart();
		System.out.println("Cart emptied.");
	}
	
	// Order products in inventory by name and price 
	public void orderInventoryByNameAndPrice(boolean ascending) {
		List<SalableProduct> orderedInventory = store.orderInventoryByNameAndPrice(ascending);
		System.out.println("Inventory ordered by name and price:");
		for (SalableProduct product : orderedInventory) {
			System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() + ", Quantity Available: " + product.getQuantity());
		}
	}
	
	
}