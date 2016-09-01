package module_4_updated.figures;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void testCalculateArea() throws Exception {
        double height = 42.64;
        double width = 135.07;

        Triangle tr = new Triangle();
        tr.setHeight(height);
        tr.setWidth(width);

        double result = tr.calculateArea();

        double expected = 0.5 * height * width;

        assertEquals(expected, result, 0.001);
    }
}