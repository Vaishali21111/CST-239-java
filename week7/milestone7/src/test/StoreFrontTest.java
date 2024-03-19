package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import milestone7.SalableProduct;
import milestone7.StoreFront;

public class StoreFrontTest {

    private StoreFront<SalableProduct> store;

    @BeforeEach
    public void setUp() {
        store = new StoreFront<>();
        // Initialize the store before each test
        store.initializeStore();
    }

    // Test to verify canceling a purchase
    @Test
    public void testCancelPurchaseProduct() {
        // Retrieve a product by name ("gun" assumed to exist)
        SalableProduct product = store.getProductByName("gun");
        // Retrieve the initial quantity of the product
        int initialQuantity = product.getQuantity();

        // Purchase one unit of the product
        store.purchaseProduct(product, 1);
        // Cancel the purchase of one unit of the product
        store.cancelPurchaseProduct(product, 1);

        // Verify that the quantity of the product is restored to the initial quantity
        Assertions.assertEquals(initialQuantity, product.getQuantity());
    }

    // Test to verify the checkout process
    @Test
    public void testCheckout() {
        // Retrieve products by name ("weapon" and "gun")
        SalableProduct product1 = store.getProductByName("weapon");
        SalableProduct product2 = store.getProductByName("gun");

        // Purchase two units of "weapon" and one unit of "gun"
        store.purchaseProduct(product1, 2);
        store.purchaseProduct(product2, 1);

        // Perform checkout and calculate the total cost
        int totalCost = store.checkout();

        // Verify that the total cost is greater than zero (assuming non-negative total cost)
        Assertions.assertTrue(totalCost > 0);
    }
}


