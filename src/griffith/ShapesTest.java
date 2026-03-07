package griffith;

import static org.junit.jupiter.api.Assertions.*;

 public class ShapesTest {
    private static final double EPSILON = 0.1;

    @org.junit.jupiter.api.Test
   public void testCircle() {
        Circle circle = new Circle("circle",3.5);
        assertEquals(38.48451,circle.area(),EPSILON);
        assertEquals(21.99115,circle.perimeter(),EPSILON);
        assertTrue(circle.toString().contains("Radius:3.5"));



    }

    @org.junit.jupiter.api.Test
    void testRhombus() {
        Rhombus rhombus = new Rhombus("Rhombus",5.0,60.0);
        assertEquals(21.6506,rhombus.area(),EPSILON);
        assertEquals(20.0,rhombus.perimeter(),EPSILON);
        assertTrue(rhombus.toString().contains("Side:5.0")&&rhombus.toString().contains("Angle:60.0"));


    }

    @org.junit.jupiter.api.Test
    void testRightAngleTriangle() {
    }
}