package module_4_updated.distance;

import java.io.IOException;

public class Runner {
    private static Coordinates coordinates = new Coordinates();

    public static void main(String[] args) throws IOException {
        try {
            readCoordinates();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[Error] please make sure you enter *two* numbers and try again\n");
            readCoordinates();
        } catch (NumberFormatException e) {
            System.out.println("[Error] please make sure you enter a number and try again\n");
            readCoordinates();
        }
    }

    private static void readCoordinates() throws IOException {
        System.out.println("Please enter the coordinates of first point (comma is the delimiter):");
        coordinates.setFirstCoordinates();

        System.out.println("\nAnd coordinates of the second point:");
        coordinates.setSecondCoordinates();

        System.out.println("\nThe distance between the points is " + coordinates.calculateDistance());
    }
}