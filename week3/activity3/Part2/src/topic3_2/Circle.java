package topic3_2;

public class Circle extends ShapeBase {
	public Circle(String name , int radius , int radius2) {
		super(name, radius , radius2);
	}
	
	@Override
	public int calculateArea() {
		return (int)Math.PI * width * height; 
	}

}
