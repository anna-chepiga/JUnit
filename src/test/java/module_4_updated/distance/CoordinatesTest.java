package module_4_updated.distance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoordinatesTest {

    @Test
    public void calculateDistance() throws Exception {
        Coordinates coordinates = new Coordinates();

        double x1 = coordinates.x1 = 98.2;
        double x2 = coordinates.x2 = -400;
        double y1 = coordinates.y1 = -365.47;
        double y2 = coordinates.y2 = 14.15;

        double result = coordinates.calculateDistance();

        double expected = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

        assertEquals(expected, result, 0.001);
    }
}