package topic3_3;

public class Bomb implements WeaponInterface {
	
	@Override
	public void fireWeapon( int power) {
		System.out.println("In Bomb.fireWeapon() with a power of " + power);
	}
	
	@Override
	public void fireWeapon() {
		System.out.println("In Bomb.fireWeapon()" );
	}
	
	@Override
	public void activate( boolean enable) {
		System.out.println("In Bomb.activate() with an enable of " + enable);
	}
}

