package griffith;

import static org.junit.jupiter.api.Assertions.*;

 public class shapesTest {
    private static final double EPSILON = 0.1;

    @org.junit.jupiter.api.Test
    void testCircle() {
        Circle circle = new Circle("circle",3.5);
        assertEquals(38.48451,circle.area(),EPSILON);
        assertEquals(21.99115,circle.perimeter(),EPSILON);
        assertTrue(circle.toString().contains("Radius:3.5"));



    }

    @org.junit.jupiter.api.Test
     void testRhombus() {
        Rhombus rhombus = new Rhombus("Rhombus",4.0,Math.PI/2);
        assertEquals(16.0,rhombus.area(),EPSILON);
        assertEquals(16.0,rhombus.perimeter(),EPSILON);
        assertEquals("Shape:rhombus,Side:4.0,Angle"+Math.PI/2,rhombus.toString());



    }
6

    @org.junit.jupiter.api.Test
    void testRightAngleTriangle() {
    }
}