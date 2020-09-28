package HomeWork4.task1;

public class Rectangle implements Shape {
    private Double rectangleHeight = 2.0;
    private Double rectangleWidth = 4.0;

    @Override
    public Double square() {
        return rectangleHeight * rectangleWidth;
    }
}
