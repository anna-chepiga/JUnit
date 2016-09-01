package module_4_updated.temperatures;

import org.junit.Test;

import static org.junit.Assert.*;

public class FahrenheitToCelsiusTest {
    @Test
    public void testConvert() throws Exception {
        double temperature = 1255.6;

        FahrenheitToCelsius f = new FahrenheitToCelsius();

        f.setFahrenheit(temperature);

        double result = f.convert();

        double expected = (temperature - 32) / 1.8;

        assertEquals(expected, result, 0.001);
    }
}