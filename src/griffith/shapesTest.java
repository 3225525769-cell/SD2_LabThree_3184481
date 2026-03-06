package griffith;

import static org.junit.jupiter.api.Assertions.*;

 public class shapesTest {
    private static final double EPSILON = 0.1;

    @org.junit.jupiter.api.Test
   public void testCircle() {
        Circle circle = new Circle("circle",3.5);
        assertEquals(38.4845,circle.area(),EPSILON);
        assertEquals(21.9911,circle.perimeter(),EPSILON);
        assertTrue(circle.toString().contains("Radius:3.5"));



    }

    @org.junit.jupiter.api.Test
    void testRhombus() {
    }

    @org.junit.jupiter.api.Test
    void testRightAngleTriangle() {
    }
}