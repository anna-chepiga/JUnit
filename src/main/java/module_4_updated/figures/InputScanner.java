package module_4_updated.figures;

import java.util.Scanner;

public class InputScanner {
    public static Scanner sc = new Scanner(System.in);

    public static int readValue() {
        return Integer.parseInt(sc.next());
    }

    public static String readChoice() {
        return sc.next();
    }
}
