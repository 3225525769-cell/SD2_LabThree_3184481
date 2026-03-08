package griffith;

import java.util.ArrayList;

public class ShapeIntegration {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Circle1", 2.0));
        shapes.add(new Circle("Circle2", 3.0));
        shapes.add(new Rhombus("Rhombus1", 5.0, Math.PI / 3));
        shapes.add(new Rhombus("Rhombus", 5.0, Math.PI / 4));
        shapes.add(new RightAngledTriangle("Triangle1", 5.0, 12.0));
        shapes.add(new RightAngledTriangle("Triangle2", 8.0, 15.0));

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area:" + shape.area());
            System.out.println("---");
        }
    }
}
