package week2_milestone;

public class StoreFront {
	
	private InventoryManager inventoryManager = new InventoryManager(); 
	private ShoppingCart shoppingCart = new ShoppingCart(); 
	private String name = "Sunshine store";

	//initializeStore , create products and add them to the inventory 
	public void initializeStore() {
		System.out.println("Welcome to the  "+ name);
		Weapon weapon1 = new Weapon("weapon1", 100 , 10);
		Weapon weapon2 = new Weapon("weapon2", 100 , 10);
		Armor armor1 = new Armor ("armor1" , 200, 20);
		Armor armor2 = new Armor ("armor2" , 200, 30);
		Health health1 = new Health("health1" , 40, 100);
		
		
		
		inventoryManager.addProduct(weapon1);
		inventoryManager.addProduct(weapon2);
		inventoryManager.addProduct(armor1);
		inventoryManager.addProduct(armor2);
		inventoryManager.addProduct(health1);
		
		
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
		shoppingCart.removeFromTheCart(product, quantity);
		int newQuantity= product.getQuantity(); 
		inventoryManager.updateInventory(product,newQuantity);
	}
	
	
	public int checkout() {
		return  shoppingCart.checkout(); 
	}
	
	public SalableProduct getProductByName(String name) {
		return inventoryManager.getProductByName(name);
	}

}