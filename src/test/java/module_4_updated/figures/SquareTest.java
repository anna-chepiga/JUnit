package module_4_updated.figures;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void calculateArea() throws Exception {

        double side = 500.23;

        Square s = new Square();
        s.setSide(side);

        double result = s.calculateArea();

        double expected = side * side;

        assertEquals(expected, result, 0.001);

    }

}