
import java.util.List; 
import java.util.ArrayList; 

public class InventoryManager { 
	private List<SalableProduct> inventory = new ArrayList<>();
	
	public void addProduct(SalableProduct product) {
		inventory.add(product); 
	}
	
	public void updateInventory(SalableProduct product , int quantity) {
		for (SalableProduct p : inventory) {
			if (p == product) {
				p.setQuantity(quantity);
				return;
			}
		}
	}
	
	
	

}
