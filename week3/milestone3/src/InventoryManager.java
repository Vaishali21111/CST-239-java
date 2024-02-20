
import java.util.List; 
import java.util.ArrayList; 

public class InventoryManager {
	
	//list of salable products 
	private List<SalableProduct> inventory = new ArrayList<>();
	
	
	//add a product to the list using .add
	public void addProduct(SalableProduct product) {
		inventory.add(product); 
	}
	 
	
	//update the inventory with the new quantity of the product {either purchased or canceled)
	public void updateInventory(SalableProduct product , int quantity) {
		for (SalableProduct p : inventory) {
			if (p == product) {
				p.setQuantity(quantity);
				return;
			}
		}
	}
	
	//return the entire inventory:  all the products in the inventory , display the name and the quantity 
	 public void displayInventory() {
	        for (SalableProduct product : inventory) {
	            System.out.println("Product Name: " + product.getName() + ", Quantity Available: " + product.getQuantity());
	        }
	   }
	
	 //get product by name , i will search for the product by name in the inventory 
	public SalableProduct getProductByName (String name) {
		for (SalableProduct product : inventory) {
			if (product.getName().equalsIgnoreCase(name)) {
				return product;
			}
			}
		return null;
		}
	}
	
	
	

