package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;

import milestone7.InventoryManager;
import milestone7.SalableProduct;

public class InventoryManagerTest {

    private InventoryManager<SalableProduct> inventoryManager;

    // This method runs before each test method, setting up the environment for testing
    @BeforeEach
    public void setUp() {
        inventoryManager = new InventoryManager<>(); // Initialize the InventoryManager
    }

    // Test case for testing initialization of inventory from file
    @Test
    public void testInitializeInventoryFromFile() {
        // Initialize the inventory from a file
        Map<String, SalableProduct> inventory = inventoryManager.initializeInventoryFromFile("products.json");
        // Check if the inventory is not null
        Assertions.assertNotNull(inventory, "Inventory should not be null");
    }

    // Test case for updating inventory
    @Test
    public void testUpdateInventory() {
        // Update the quantity of a product weapon
    	// Initialize inventory
        inventoryManager.initializeInventoryFromFile("products.json"); 
     // Update quantity of "weapon" to 10
        inventoryManager.updateInventory("weapon", 10); 
        // Retrieve updated product
        SalableProduct product = inventoryManager.getProductByName("weapon");
        // Check if product exists
        Assertions.assertNotNull(product, "Product should not be null");
     // Check if quantity is updated
        Assertions.assertEquals(10, product.getQuantity(), "Quantity should be updated to 10"); 
    }

    // Test case for retrieving a product by name
    @Test
    public void testGetProductByName() {
        // Retrieve a product by name ("productName" assumed to exist)
        inventoryManager.initializeInventoryFromFile("products.json"); // Initialize inventory
        SalableProduct product = inventoryManager.getProductByName("weapon"); // Retrieve product by name
        Assertions.assertNotNull(product, "Product should not be null"); // Check if product exists
    }

    // Test case for displaying inventory
    @Test
    public void testDisplayInventory() {
        // Display inventory
        inventoryManager.initializeInventoryFromFile("products.json"); // Initialize inventory
        // Redirect System.out to capture printed output
        System.setOut(new java.io.PrintStream(System.out) {
            @Override
            public void println(String msg) {
                super.println("Captured output: " + msg); // Print captured output
            }
        });
        inventoryManager.displayInventory(); // Display inventory
        // Reset System.out
        System.setOut(System.out);
      
    }
}
