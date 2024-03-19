package test;
import org.junit.Test;

import milestone7.SalableProduct;

import org.junit.Assert;



public class SalableProductTest {

    @Test
    //Testing if when I purchase a product the quantity will be changed or not
    public void testPurchaseSufficientQuantity() {
    	// a new salable product product 1 with quantity 20 and price 10
        SalableProduct product = new SalableProduct("Product 1", "this is product 1", 10, 20);
        int initialQuantity = product.getQuantity();
        int quantityToPurchase = 5;

        product.purchase(quantityToPurchase);
        // compare the quality between the initial quality minus quality to purchase and the quantity of the product
        Assert.assertEquals(initialQuantity - quantityToPurchase, product.getQuantity());
    }

    @Test
    
    //Testing if the quantity of the product will not change if we don't have sufficient quantity 
    public void testPurchaseInsufficientQuantity() {
      	// a new salable product product 2 with quantity 10 and price 5
        SalableProduct product = new SalableProduct("Product 2", "this is product 2 ", 10, 5);
        int initialQuantity = product.getQuantity();
        int quantityToPurchase = 10;

        product.purchase(quantityToPurchase);

        Assert.assertEquals(initialQuantity, product.getQuantity());
    }
    
    

    @Test
    //Testing if when I cancel the purchase of a product the quantity will be changed or not
    public void testCancelPurchase() {
        SalableProduct product = new SalableProduct("Product 3", "Description 3", 10, 15);
        int initialQuantity = product.getQuantity();
        //the quantity to cancel
        int quantityToCancel = 5;

        product.cancelPurchase(quantityToCancel);

        Assert.assertEquals(initialQuantity + quantityToCancel, product.getQuantity());
    }
}
