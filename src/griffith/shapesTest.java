package griffith;

import static org.junit.jupiter.api.Assertions.*;

 public class shapesTest {
    private static final double EPSILON = 0.1;

    @org.junit.jupiter.api.Test
   public void testCircle() {
        Circle circle = new Circle("circle",3.5);
        assertEquals(38.48451,circle.area(),EPSILON);
        assertEquals(21.99115,circle.perimeter(),EPSILON);
        assertTrue(circle.toString().contains("Radius:3.5"));



    }

    @org.junit.jupiter.api.Test
    public void testRhombus() {
        Rhombus rhombus = new Rhombus("Rhombus", 5.0,6.0, 8.0);
        double expected1 =(6.0*8.0)/2;
        assertEquals(expected1,rhombus.area(),EPSILON);
        double expected2 = 4*5.0;
        assertEquals(expected2,rhombus.perimeter(),EPSILON);
        String result =rhombus.toString();
        assertTrue(result.contains("side:5.0"));
        assertTrue(result.contains("diagonal1:6.0"));
        assertTrue(result.contains("diagonal2:8.0"));
        assertTrue(result.contains("Rhombus"));
    }


    @org.junit.jupiter.api.Test
    void testRightAngleTriangle() {
    }
}