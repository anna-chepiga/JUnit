package module_4_updated.temperatures;

import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitToCelsiusTest {
    @Test
    public void convert() throws Exception {

        FahrenheitToCelsius f = new FahrenheitToCelsius();

        f.setFahrenheit(1255.6);

        double result = f.convert();

        double expected = (1255.6 - 32) / 1.8;

        assertEquals(expected, result, 0.001);
    }
}