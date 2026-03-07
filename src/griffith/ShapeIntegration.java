package griffith;

import java.util.ArrayList;

public class ShapeIntegration {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Circle1",2.0));
        shapes.add(new Circle("Circle2",5.0));
    }
}
