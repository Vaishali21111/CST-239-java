
public class StoreFront {
	
	private InventoryManager inventoryManager = new InventoryManager(); 
	private ShoppingCart shoppingCart = new ShoppingCart(); 
	
	public void initializeStore() {
		SalableProduct product1 =new SalableProduct("Product1" ,"This is my product 1" , 12, 1000);
		SalableProduct product2 =new SalableProduct("Product2" ,"This is my product 2" , 15, 2000); 
		inventoryManager.addProduct(product1);
		inventoryManager.addProduct(product2);
		
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

}
