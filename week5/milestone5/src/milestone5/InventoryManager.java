package milestone5;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

 class InventoryManager<T extends SalableProduct> {
	 //My inventory will be a map , this map has a string (the name of the product) and the object product 
    private Map<String, T> inventory;

    
    //constructor 
    public InventoryManager() {
        this.inventory = new HashMap<>();
    }
    
    //Reading all the products from the json file 
    private Map<String, T> readFromFile(String filename) {
    	//create a map salable products 
        Map<String, T> salableProducts = new HashMap<>();
        //verify if the file exist 
        try (Scanner s = new Scanner(new File(filename))) {
            ObjectMapper objectMapper = new ObjectMapper();
            while (s.hasNext()) {
            	//read the json file line by line 
                String json = s.nextLine();
                //convert each line into a salableProduct object 
                
                T salableProduct = objectMapper.readValue(json, new TypeReference<T>() {});
                //add the name of the product (key) and the salable product (value) to the map salable products 
                salableProducts.put(salableProduct.getName(), salableProduct);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return salableProducts;
    }
    // initializing the inventoring by reading the salable  products in the products.json
    public Map<String, T> initializeInventoryFromFile(String filename) {
        this.inventory = readFromFile(filename);
        return inventory;
    }
     
    
    //update the inventory whenever a product is purchased or canceling the purchase 
    public void updateInventory(String productName, int quantity) {
        T existingProduct = inventory.get(productName);
        if (existingProduct != null) {
            existingProduct.setQuantity(quantity);
            inventory.put(productName, existingProduct);
        }
    }
     // display all the inventory elements 
    public void displayInventory() {
        for (T product : inventory.values()) {
            System.out.println("Product Name: " + product.getName() + ", Quantity Available: " + product.getQuantity());
        }
    }
    
    
  // searching for the product by name 
    public T getProductByName(String name) {
        return inventory.get(name);
    }

    // Abstract method to get TypeReference for deserialization
    protected Class<T> getTypeReference() {
        // Implement this method in subclasses
        return null;
    }
    
 // Method to get all products in the inventory
    public List<T> getAllProducts() {
        return new ArrayList<>(inventory.values());
    }
}
