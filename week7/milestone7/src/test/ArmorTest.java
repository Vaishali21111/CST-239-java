package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import milestone7.Armor;

public class ArmorTest {

    @Test
    public void testArmorConstructor() {
        // Create an instance of Armor
        Armor armor = new Armor("Steel Armor", 50, 10);

        // Check if the name is correct
        assertEquals("Steel Armor", armor.getName());
        //check if the description is correct 
        assertEquals("This is an Armor", armor.getDescription()); 
        //check if the price is correct 
        assertEquals(50, armor.getPrice());
        //check if the quantity is correct 
        assertEquals(10, armor.getQuantity());
    }
}

