package module_4_updated.temperatures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelsiusToFahrenheitTest {
    @Test
    public void testConvert() throws Exception {
        double temperature = -723.6;

        CelsiusToFahrenheit c = new CelsiusToFahrenheit();

        c.setCelsius(temperature);

        double result = c.convert();

        double expected = (temperature * 1.8) + 32;

        assertEquals(expected, result, 0.001);
    }
}