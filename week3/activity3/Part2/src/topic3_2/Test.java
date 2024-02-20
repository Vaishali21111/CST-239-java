package topic3_2;

public class Test {
	private static void displayArea(ShapeBase shape) {
		System.out.println("This a shape named" + shape.getName()+ " with an area of " + shape.calculateArea());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeBase[]shapes = new ShapeBase[4] ; 
		shapes[0] = new Rectangle("Rectangle" , 10 , 200); 
		shapes [1] = new Triangle("Triangle" , 10 , 50); 
		shapes[2] =new Circle("circle" , 10 ,10);
		shapes[3] = new Trapezoid("Trapezoid" , 10, 8,9);
		
		
		//for all shapes display its area 
		for (int x=0 ; x<shapes.length ; x++) {
			displayArea(shapes[x]);
		}
		
		

	}

}
