package test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import milestone7.Weapon;

public class WeaponTest {

    @Test
    public void testWeaponConstructor() {
        // Create an instance of Weapon
        Weapon weapon = new Weapon("Sword", 100, 2);

        // Check if the name is correct
        assertEquals("Sword", weapon.getName());
        // Check if the description is correct
        assertEquals("This is a Weapon product", weapon.getDescription());
        // Check if the price is correct
        assertEquals(100, weapon.getPrice());
        // Check if the quantity is correct
        assertEquals(2, weapon.getQuantity());
    }
}

