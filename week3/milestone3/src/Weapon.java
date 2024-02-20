


public class Weapon extends SalableProduct implements Comparable<Weapon> {
    
	//weapon class is a child class for salable products and it implements the interface comparable 
    public Weapon(String name, int price, int quantity) {
        super(name, "This is a Weapon product", price, quantity);
    }
  
    
    //override compareTo method and compare the weapons based on their names 
    @Override
    public int compareTo(Weapon otherWeapon) {
        // Ignore case when comparing names
        return this.getName().compareToIgnoreCase(otherWeapon.getName());
    }
}