package module_4_updated.temperatures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelsiusToFahrenheitTest {
    @Test
    public void convert() throws Exception {

        CelsiusToFahrenheit c = new CelsiusToFahrenheit();

        c.setCelsius(-723.6);

        double result = c.convert();

        double expected = (-723.6 * 1.8) + 32;

        assertEquals(expected, result, 0.001);
    }
}