
public class Engine {
	
	private int  power ; 
	
	public Engine(int power) {
		this.power = power;
	}
	
	public int  getPower() {
		return this.power;
	}
	
	public void setPower(int power) {
		this.power= power; 
		
	}
	
	public void start() {
		System.out.println("Engine starting"); 
	}
	
	public void stop() {
		System.out.println("Stopping engine"); 
	}

}
