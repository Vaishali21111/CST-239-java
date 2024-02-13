
public class StoreFront {
	
	
	// store front has an inventory manager and a shopping cart 
	private InventoryManager inventoryManager = new InventoryManager(); 
	private ShoppingCart shoppingCart = new ShoppingCart(); 
	
	// this method will initialize the store I will have product 1 and product 2 in the store and i will add these 2 
	// products to the inventory 
	public void initializeStore() {
		SalableProduct product1 =new SalableProduct("Product1" ,"This is my product 1" , 12, 1000);
		SalableProduct product2 =new SalableProduct("Product2" ,"This is my product 2" , 15, 2000); 
		inventoryManager.addProduct(product1);
		inventoryManager.addProduct(product2);
		
	}
	
	// this is purchase product method , whenever i purchase a product the quantity of this product will be  updated in the inventory 
	public void purchaseProduct(SalableProduct product , int quantity) {
		shoppingCart.addToCart(product, quantity);
		int newQuantity= product.getQuantity(); 
		inventoryManager.updateInventory(product,newQuantity);
	}
	
	// this is cancelpurchaseproduct method, whenever i cancel purchase  the quantity of this product will be updated in the inventory 
		
	public void CancelPurchaseProduct(SalableProduct product , int quantity) {
		shoppingCart.removeFromTheCart(product, quantity);
		int newQuantity= product.getQuantity(); 
		inventoryManager.updateInventory(product,newQuantity);
	}
	
	//this is the checkout method which will return the total of the checkout 
	public int checkout() {
		return  shoppingCart.checkout(); 
	}

}
