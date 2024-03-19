package milestone7;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

public class InventoryManager<T extends SalableProduct> {
    private Map<String, T> inventory;

    public InventoryManager() {
        this.inventory = new HashMap<>();
    }

    private Map<String, T> readFromFile(String filename) {
        Map<String, T> salableProducts = new HashMap<>();
        try (Scanner s = new Scanner(new File(filename))) {
            ObjectMapper objectMapper = new ObjectMapper();
            while (s.hasNext()) {
                String json = s.nextLine();
                T salableProduct = objectMapper.readValue(json, new TypeReference<T>() {});
                salableProducts.put(salableProduct.getName(), salableProduct);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return salableProducts;
    }

    public Map<String, T> initializeInventoryFromFile(String filename) {
        this.inventory = readFromFile(filename);
        return inventory;
    }

    public void updateInventory(String productName, int quantity) {
        T existingProduct = inventory.get(productName);
        if (existingProduct != null) {
            existingProduct.setQuantity(quantity);
            inventory.put(productName, existingProduct);
        }
    }

    public void displayInventory() {
        for (T product : inventory.values()) {
            System.out.println("Product Name: " + product.getName() + ", Quantity Available: " + product.getQuantity());
        }
    }

    public T getProductByName(String name) {
        return inventory.get(name);
    }

    public List<T> getAllProducts() {
        return new ArrayList<>(inventory.values());
    }

    // Abstract method to get TypeReference for deserialization
    protected Class<T> getTypeReference() {
        // Implement this method in subclasses
        return null;
    }
    
    public void updateInventoryFromJSON(String jsonData) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<T> updatedProducts = objectMapper.readValue(jsonData, new TypeReference<List<T>>() {});
            for (T product : updatedProducts) {
                inventory.put(product.getName(), product);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}

