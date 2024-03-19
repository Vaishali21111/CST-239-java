package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import milestone7.Health;

public class HealthTest {

    @Test
    public void testHealthConstructor() {
        // Create an instance of Health
        Health health = new Health("Potion", 20, 5);

        // Check if the name is correct
        assertEquals("Potion", health.getName());
        // Check if the description is correct
        assertEquals("this is an Health product", health.getDescription());
        // Check if the price is correct
        assertEquals(20, health.getPrice());
        // Check if the quantity is correct
        assertEquals(5, health.getQuantity());
    }
}

