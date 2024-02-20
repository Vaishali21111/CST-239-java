package topic3_3;

public class Game {
	
	private static void fireWeapon(WeaponInterface weapon) {
		if (weapon instanceof Bomb) {
			System.out.println("I am a bomb ");
		}else {
			System.out.println("I am a gun ");
			
		}
		weapon.activate(true);
		weapon.fireWeapon(5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an array of weapon interfaces 
		WeaponInterface[] weapons = new WeaponInterface[2];
		weapons[0] = new Bomb();
		weapons[1] = new Gun(); 
		
		for(int x=0 ; x< weapons.length ; x++) {
			fireWeapon(weapons[x]);
		}
		
		

	}

}
