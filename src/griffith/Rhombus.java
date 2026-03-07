package griffith;

public class Rhombus extends Shape {
    private double side;
    private double angle;
    public Rhombus(String name,double side,double angle){
        super(name);
        this.side = side;
        this.angle =angle;
    }
}
