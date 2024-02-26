package milestone3;

import java.util.List;
import java.util.Scanner;
public class User {
	
	private StoreFront store; 
	private Scanner scanner; 
	
	public User(StoreFront store) {
		this.store= store;
		this.scanner= new Scanner(System.in);
	}
	
	public void displayActions() {
		System.out.println("Welcome, please choose an action");
		System.out.println("1. Purchase a product");
		System.out.println("2. Cancel a purchase");
		System.out.println("3. checkout");
		System.out.println("4. get the contemts of the shopping Cart"); 
		System.out.println("5.empty Cart");
		
	
		}
	
	public void interact() {
		while(true) {
			displayActions ();
			int numberAction = scanner.nextInt();
			scanner.nextLine();
			
			switch(numberAction) {
			case 1 :
			
				purchaseProduct();
				break;
			
			
			case 2 :
				cancelPurchase();
				break;
			
			case 3 :
				System.out.println(store.checkout());
				break;
				
			case 4:
				displayContent();
				break;
				
			case 5:
				emptyCart();
				break;
			}
		}
	}
	
	
// purchase product : ask the user to enter the product name and the quantity , then I will search for the product in the store using the method getproductBy name  
// if it is available than the user can purchase the product.
	public void purchaseProduct() {
		System.out.println("Enter The product name ");
		String productName = scanner.nextLine();
		System.out.println("Enter the quantity");
		int quantity = scanner.nextInt(); 
		scanner.nextLine();
		SalableProduct product = store.getProductByName(productName);
		if (product != null) {
			store.purchaseProduct(product, quantity);
			
		}else {
			System.out.println("Product not found");
		}
			
	}
	

	//cancel purchase : ask to enter the product name and the quantity , then I will search for the product in the store using the method getproductBy name  
	// if it is available than the user can cancel his purchase 
	public void cancelPurchase() {
		System.out.println("Enter The product name ");
		String productName = scanner.nextLine();
		System.out.println("Enter the quantity");
		int quantity = scanner.nextInt(); 
		scanner.nextLine();
		SalableProduct product = store.getProductByName(productName);
		if (product != null) {
			store.CancelPurchaseProduct(product, quantity);
			
		}else {
			System.out.println("Product not found");
		}
			
	}
	
	
	//display content of the shopping cart 
	public void displayContent () {
		ShoppingCart shoppingCart = store.getShoppingCart();
		List<CartItem> items = shoppingCart.getCartContents();
		for (CartItem product : items) {
		    // Print product details
			
		    System.out.println("Name: " + product.getProduct().getName() +" quantity "+ product.getQuantity());
		}
		
	}
	
	//empty the cart
	public void emptyCart() {
		ShoppingCart shoppingCart = store.getShoppingCart();
		shoppingCart.emptyCart();
		System.out.println("Empty Cart");
	}

}