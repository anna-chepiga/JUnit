package module_4_updated.figures;

public class Bootstrap {
    private static void printInitialDetails() {
        System.out.println("Select a figure and enter its number: \n 1. circle \n 2. triangle \n 3. square");
        System.out.println("Enter E to exit");
    }

    public static void main(String[] args) {
        Figure figure;

        for (; ; ) {
            printInitialDetails();
            String choice = InputScanner.readChoice();

            try {
                switch (choice) {
                    case "1":
                        Circle circle = new Circle();
                        System.out.println("You selected circle, please enter radius");

                        double radius = InputScanner.readValue();
                        circle.setRadius(radius);

                        figure = circle;
                        break;
                    case "2":
                        Triangle triangle = new Triangle();
                        System.out.println("You selected triangle, please enter height and width");

                        double height = InputScanner.readValue();
                        triangle.setHeight(height);

                        double width = InputScanner.readValue();
                        triangle.setWidth(width);

                        figure = triangle;
                        break;
                    case "3":
                        Square square = new Square();
                        System.out.println("You selected square, please enter side length");

                        double side = InputScanner.readValue();
                        square.setSide(side);

                        figure = square;
                        break;
                    case "E":
                        System.exit(1);
                    default:
                        System.out.println("Please enter a number from 1 to 3 or E to exit\n");
                        continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Values should be numbers, please try again\n");
                continue;
            }

            double calculate = figure.calculateArea();
            System.out.println("Area of your figure is: " + calculate + "\n");
        }
    }
}