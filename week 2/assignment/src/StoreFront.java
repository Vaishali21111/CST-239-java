
public class StoreFront {
	
	private InventoryManager inventoryManager = new InventoryManager(); 
	private ShoppingCart shoppingCart = new ShoppingCart(); 
	private String name = "Sunshine store";
	
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
	
	public void purchaseProduct(SalableProduct product , int quantity) {
		shoppingCart.addToCart(product, quantity);
		int newQuantity= product.getQuantity(); 
		inventoryManager.updateInventory(product,newQuantity);
	}
	
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
