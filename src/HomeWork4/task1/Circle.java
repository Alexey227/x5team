package HomeWork4.task1;

public class Circle implements Shape {
    private Double radius = 10.1;

    @Override
    public Double square() {
        return Math.PI * Math.pow(radius, 2);
    }
}
