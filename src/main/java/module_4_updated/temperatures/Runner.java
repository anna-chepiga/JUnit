package module_4_updated.temperatures;

public class Runner {
    public static void main(String[] args) {
        TemperatureChoiceBuilder builder = new TemperatureChoiceBuilder();

        for (; ; ) {
            try {
                TemperatureSample sample = builder.readConsole();

                if (sample == null) {
                    System.out.println("Incorrect entry, please try again:\n");
                    continue;
                }

                double result = sample.convert();
                System.out.println("Entered temperature is " + result + " in " + sample.getOppositeType() + "\n");

            } catch (NumberFormatException e) {
                System.out.println("Temperature should be a number, please try again:\n");
            }
        }
    }
}