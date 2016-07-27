package module_4_updated.temperatures;

import java.util.Locale;
import java.util.Scanner;

public class TemperatureChoiceBuilder {
    private static final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public TemperatureSample readConsole() {
        System.out.println("Please select:\n1) convert from Fahrenheit to Celsius,\n2) Convert from Celsius to Fahrenheit\n\tOr enter Quit to exit:");
        String choice = sc.next();

        switch (choice) {
            case "1":
                FahrenheitToCelsius f = new FahrenheitToCelsius();
                printDetails(f);

                double fahrenheit = Double.parseDouble(sc.next());
                f.setFahrenheit(fahrenheit);

                return f;
            case "2":
                CelsiusToFahrenheit c = new CelsiusToFahrenheit();
                printDetails(c);

                double celsius = Double.parseDouble(sc.next());
                c.setCelsius(celsius);

                return c;
            case "Quit":
            case "quit":
                System.exit(1);
        }
        return null;
    }

    private void printDetails(TemperatureSample sample) {
        System.out.println("...and enter temperature in " + sample.getType());
    }
}