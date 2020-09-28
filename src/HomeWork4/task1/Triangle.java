package HomeWork4.task1;

public class Triangle implements Shape {
    private Double A = 1.0;
    private Double B = 2.0;
    private Double C = 3.0;

    @Override
    public Double square() {
        Double square = (A + B + C) / 2;
        return square;
    }
}
