package griffith;

public class Rhombus extends Shape {
    private double side;
    private double angle;

    public Rhombus(String name, double side,double angle){
        super(name);
        this.side = side;
        this.angle = angle;

    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side=side;
    }
    public double getAngle(){
        return angle;
    }
    public void setAngle(double angle){
        this.angle =angle;}
        @Override
        public double area(){
            return side*side*Math.sin(Math.toRadians(angle));
        }
        @Override
    public double perimeter(){
         return 4*side;

    }
}
