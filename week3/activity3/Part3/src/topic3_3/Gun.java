package topic3_3;

public class Gun implements WeaponInterface {
	
	@Override
	public void fireWeapon( int power) {
		System.out.println("In Gun.fireWeapon() with a power of " + power);
	}
	
	@Override
	public void fireWeapon() {
		System.out.println("In Gun.fireWeapon()" );
	}
	
	@Override
	public void activate( boolean enable) {
		System.out.println("In Gun.activate() with an enable of " + enable);
	}
}