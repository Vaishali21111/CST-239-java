
import java.util.List; 
import java.util.ArrayList; 

public class InventoryManager { 
	
	// this is a list of the salable products in the inventory 
	private List<SalableProduct> inventory = new ArrayList<>();
	
	//this is add product method which will add the product to the inventory 
	public void addProduct(SalableProduct product) {
		inventory.add(product); 
	}
	
	
	//this is  update inventory method which will update the quantity of the product in  the inventory 
	public void updateInventory(SalableProduct product , int quantity) {
		for (SalableProduct p : inventory) {
			if (p == product) {
				p.setQuantity(quantity);
				return;
			}
		}
	}
	
	
	

}



