package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import java.util.List;

import milestone7.CartItem;
import milestone7.SalableProduct;
import milestone7.ShoppingCart;

public class ShoppingCartTest {

    private ShoppingCart<SalableProduct> shoppingCart; // Declare a ShoppingCart instance
    private SalableProduct product1; // Declare a SalableProduct instance 1
    private SalableProduct product2; // Declare a SalableProduct instance 2

    @BeforeEach
    public void setUp() {
        shoppingCart = new ShoppingCart<>(); // Initialize the ShoppingCart
        // Create SalableProduct instances with name, description, price, and quantity
        product1 = new SalableProduct("Product 1", "Description 1", 10, 20); 
        product2 = new SalableProduct("Product 2", "Description 2", 20, 30); 
    }

    @Test
    public void testAddToCart() {
        // Test adding a product to the cart
        shoppingCart.addToCart(product1, 2); // Add product1 to the cart with quantity 2
        List<CartItem<SalableProduct>> cartContents = shoppingCart.getCartContents(); // Get the contents of the cart
        // Check if the cart contains one item with product1 and quantity 2
        Assertions.assertEquals(1, cartContents.size(), "Cart should contain one item"); 
        CartItem<SalableProduct> item = cartContents.get(0); // Get the cart item
        // Check if the product in the cart is product1
        Assertions.assertEquals(product1, item.getProduct(), "Incorrect product in cart"); 
        // Check if the quantity of product1 in the cart is 2
        Assertions.assertEquals(2, item.getQuantity(), "Incorrect quantity in cart"); 
    }

    @Test
    public void testUpdateQuantityInCart() {
        // Test updating the quantity of a product in the cart
        shoppingCart.addToCart(product1, 2); // Add product1 to the cart with quantity 2
        shoppingCart.addToCart(product2, 3); // Add product2 to the cart with quantity 3
        shoppingCart.updateQuantityInCart(product1, 1); // Update the quantity of product1 in the cart to 1
        List<CartItem<SalableProduct>> cartContents = shoppingCart.getCartContents(); // Get the contents of the cart
        // Iterate over the cart items
        for (CartItem<SalableProduct> item : cartContents) {
            if (item.getProduct().equals(product1)) { // If the item is product1
                // Check if the quantity of product1 in the cart is updated to 1
                Assertions.assertEquals(1, item.getQuantity(), "Quantity should be updated to 1");
            }
        }
    }

    @Test
    public void testCheckout() {
        // Test the checkout functionality
        shoppingCart.addToCart(product1, 2); // Add product1 to the cart with quantity 2
        shoppingCart.addToCart(product2, 3); // Add product2 to the cart with quantity 3
        int total = shoppingCart.checkout(); // Get the total amount
        // Check if the total amount is calculated correctly based on the products' prices and quantities
        Assertions.assertEquals(2 * product1.getPrice() + 3 * product2.getPrice(), total, "Incorrect total amount");
    }

    @Test
    public void testEmptyCart() {
        // Test emptying the cart
        shoppingCart.addToCart(product1, 2); // Add product1 to the cart with quantity 2
        shoppingCart.addToCart(product2, 3); // Add product2 to the cart with quantity 3
        shoppingCart.emptyCart(); // Empty the cart
        List<CartItem<SalableProduct>> cartContents = shoppingCart.getCartContents(); // Get the contents of the cart
        // Check if the cart is empty after emptying it
        Assertions.assertTrue(cartContents.isEmpty(), "Cart should be empty"); 
    }
}
