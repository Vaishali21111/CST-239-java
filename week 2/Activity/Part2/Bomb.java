package App;

public class Bomb extends Weapon {
	public void fireWeapon(int power)
	{
System.out.println("In Bomb.fireweapon() with a power of "+power);
	}
	
public void fireWeapon() {
		System.out.println("In overloading Bomb . fireWeapon()");
		super.fireWeapon(10);
		
	}

public void activate(boolean enable) {
	System.out.println("In the bomb.activate() with an enable of " + enable );
}
}
