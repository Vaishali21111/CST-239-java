
public class Car {
	
	private Engine engine; 
	private Tire[] tires = new Tire[4]; 
	
	public Car (int power , int frontLeftPsi , int rightLeftPsi , int rearLeftPsi , int rearRighPsi) {
		this.engine = new Engine (power); 
		tires[0]= new Tire(frontLeftPsi); 
		tires[1]= new Tire(rightLeftPsi );
		tires[2]= new Tire(rearLeftPsi); 
		tires[3]= new Tire(rearRighPsi); 
	}
	
	public void start() {
		for(int i=0 ; i< 4 ; i++) {
			int psi = tires[0].getPressure();
		    if(psi < 32) {
		    	System.out.println("The pressure should be at least 32 psi");
		    	return;
		    }
		}
		engine.start();
		System.out.println("The car is starting"); 
	}
	
	public void run (int speed ) {
		System.out.println("The car is running at speed " + speed); 
	}

	public void stop() {
		engine.stop();
		System.out.println("The car is stopping"); 
	}
	public void restart() {
		
		System.out.println("The car is restarting"); 
	}
	
	public static void main(String[] args) {
		Car car = new Car(10000 , 12, 45, 56, 100); 
		car.start(); 
		car.run(10);
		car.stop(); 
		car.restart();
	}
	

}
