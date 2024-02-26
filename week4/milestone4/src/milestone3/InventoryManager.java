package milestone3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventoryManager {
	//attribute inventory 
    private List<SalableProduct> inventory;

    public InventoryManager() {
        this.inventory = new ArrayList<>();
    }

    //read from json file, i will read line by line and i will convert each line into a salable product object 
    private static ArrayList<SalableProduct> readFromFile(String filename) {
        ArrayList<SalableProduct> salableProducts = new ArrayList<>();
        try (Scanner s = new Scanner(new File(filename))) {
            ObjectMapper objectMapper = new ObjectMapper();
            while (s.hasNext()) {
                String json = s.nextLine();
                SalableProduct salableProduct = objectMapper.readValue(json, SalableProduct.class);
                salableProducts.add(salableProduct);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return salableProducts;
    }
    
    
    // Method to initialize inventory from a file
    public List<SalableProduct> initializeInventoryFromFile(String filename) {
        this.inventory = readFromFile(filename);
        return inventory; 
    }

    
    ///update the quantity of the product in the inventory 
    public void updateInventory(SalableProduct product, int quantity) {
        for (SalableProduct p : inventory) {
            if (p == product) {
                p.setQuantity(quantity);
                return;
            }
        }
    }

    public void displayInventory() {
        for (SalableProduct product : inventory) {
            System.out.println("Product Name: " + product.getName() + ", Quantity Available: " + product.getQuantity());
        }
    }

    public SalableProduct getProductByName(String name) {
        for (SalableProduct product : inventory) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

 
   
}
