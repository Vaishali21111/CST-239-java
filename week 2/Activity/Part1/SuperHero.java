package App;
import java.util.Random;
class SuperHero {
	private String name; 
	private int health;
	private boolean isDead;
	
	public SuperHero (String name , int health) {
		this.name = name; 
		this.health = health;
	}
	
	public void attack(SuperHero opponent)
	{
		Random rand = new Random ();
		int damage = rand.ints(1, (10 + 1)).findFirst().getAsInt();
		opponent.determineHealth(damage);
		System.out.println(String.format("%s has damage of %d and health of %d", opponent.name, damage , opponent.health ));
		
		
	}
	
	public boolean isDead() {
		return this.isDead;
	}
	
	
	public void determineHealth(int damage ) {
		if (this.health - damage <= 0) {
			this.health= 0 ;
			this.isDead= true; 
			
		}else {
			this.health = this.health - damage ; 
		}
	
	
}

	

}
