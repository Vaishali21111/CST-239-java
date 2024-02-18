package App;

public abstract class Weapon {
	public void fireWeapon(int power)
	{
System.out.println("In weapon.fireweapon() with a power of "+power);
	}
	
	public abstract void activate (boolean enable) ;
}
