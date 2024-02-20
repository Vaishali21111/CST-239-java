package topic3_2;

public class Trapezoid extends ShapeBase {
    
    private int base1;
    private int base2;
    
    public Trapezoid(String name, int base1, int base2, int height) {
        super(name, base1, height);
        this.base2 = base2;
    }
    
    @Override
    public int calculateArea() {
        return (base1 + base2) * height / 2;
    }
}

