package milestone3;

import java.util.List;

public class StoreFront {
	//adding inventory manager to the store front 
	private InventoryManager inventoryManager = new InventoryManager(); 
	
	//integration of the shopping cart in the store front 
	private ShoppingCart shoppingCart = new ShoppingCart(); 
	private String name = "Sunshine store";

	//initializeStore , create products and add them to the inventory 
	public void initializeStore() {
		System.out.println("Welcome to the  "+ name);
		List<SalableProduct> inventory = inventoryManager.initializeInventoryFromFile("products.json");
		System.out.println("Products Available"); 
		// Iterate over each product in the inventory
		for (SalableProduct product : inventory) {
		    // Print product details
		    System.out.println("Name: " + product.getName() + ", Price: " + product.getPrice() + ", Quantity Available: " + product.getQuantity());
		}
		
			
		
		
		
	}
	
	//This is my purchase product method , i will add the product to the shopping cart and i will update the quantity of the product 
	//in the inventory 
	
	public void purchaseProduct(SalableProduct product , int quantity) {
		shoppingCart.addToCart(product, quantity);
		int newQuantity= product.getQuantity(); 
		inventoryManager.updateInventory(product,newQuantity);
	}
	
	//This is my cancel purchase product method , i will remove  the product from the shopping cart and i will update the quantity of the product 
	//in the inventory 
	
	public void CancelPurchaseProduct(SalableProduct product , int quantity) {
		shoppingCart.updateQuantityInCart(product, quantity);
		int newQuantity= product.getQuantity(); 
		inventoryManager.updateInventory(product,newQuantity);
	}
	
	
	public int checkout() {
		return  shoppingCart.checkout(); 
	}
	
	public SalableProduct getProductByName(String name) {
		return inventoryManager.getProductByName(name);
	}
//get shoppping cart 
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

}
