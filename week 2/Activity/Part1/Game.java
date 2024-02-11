package App;
import java.util.Random;

public class Game {
	public static void main(String[] args)
	{
		Random rand = new Random(); 
		int health1 =  rand.ints(1, (1000 + 1)).findFirst().getAsInt();
		int health2 =  rand.ints(1, (1000 + 1)).findFirst().getAsInt(); 
		
		//create Superman and Batman 
		System.out.println("Creating our SuperHeros ...");
		Superman superman = new Superman(health1); 
		Batman batman = new Batman (health2) ; 
		System.out.println("Super Hereos Created");
		
		//Run the game until one of the super heros is dead 
		System.out.println("Running our game ....");
		while(!superman.isDead()&& !batman.isDead()) {
			superman.attack(batman);
			batman.attack(superman);
			
			if (superman.isDead()) {
				System.out.println("Batamn defeated Superman");
			}
			if (batman.isDead()) {
				System.out.println("Superman defeated Batman");
			}
			
		}
	}

}
