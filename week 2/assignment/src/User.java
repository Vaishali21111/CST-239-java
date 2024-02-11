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
	
		}
	
	public void intercat() {
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
			}
		}
	}
	
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

}
