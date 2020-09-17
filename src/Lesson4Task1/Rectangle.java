package Lesson4Task1;

public class Rectangle implements Shape {

    Double rectangleHeight;
    Double rectangleWidth;

    public Rectangle(Double rectangleHeight, Double rectangleWidth) {
        this.rectangleHeight = rectangleHeight;
        this.rectangleWidth = rectangleWidth;
    }

    public Rectangle() {
        this(2.0, 4.0);
    }

    @Override
    public Double square() {
        return rectangleHeight * rectangleWidth;
    }
}
