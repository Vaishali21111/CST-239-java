package milestone3;


public class Weapon extends SalableProduct implements Comparable<Weapon> {
    
    public Weapon(String name, int price, int quantity) {
        super(name, "This is a Weapon product", price, quantity);
    }

    @Override
    public int compareTo(Weapon otherWeapon) {
        // Ignore case when comparing names
        return this.getName().compareToIgnoreCase(otherWeapon.getName());
    }
}