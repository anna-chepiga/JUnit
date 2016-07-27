package module_4_updated.distance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coordinates {

    public double x1, x2, y1, y2;
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String[] split;

    // антишаблон копипаст - похожие методы
    // в качестве решения - создать один метод, который читал бы 4 разные цифры с клавиатуры
    // но пока что мне не удалось адекватно его реализовать

    public void setFirstCoordinates() throws IOException {
        split = readCoordinates();
        x1 = Double.parseDouble(split[0]);
        y1 = Double.parseDouble(split[1]);
    }

    public void setSecondCoordinates() throws IOException {
        split = readCoordinates();
        x2 = Double.parseDouble(split[0]);
        y2 = Double.parseDouble(split[1]);
    }

    private String[] readCoordinates() throws IOException {
        String inputForCoordinates = READER.readLine();
        return inputForCoordinates.split(",");
    }

    public double calculateDistance() {
        return Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }
}