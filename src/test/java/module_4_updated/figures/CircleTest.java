package module_4_updated.figures;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void calculateArea() throws Exception {

        double radius = 89.24;

        Circle c = new Circle();
        c.setRadius(radius);

        double result = c.calculateArea();

        double expected = Math.pow(radius, 2) * Math.PI;

        assertEquals(expected, result, 0.001);
    }
}