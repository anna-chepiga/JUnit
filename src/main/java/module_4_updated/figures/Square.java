package module_4_updated.figures;

public class Square implements Figure {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}