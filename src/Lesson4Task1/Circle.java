package Lesson4Task1;

public class Circle implements Shape {

    Double radius;

    public Circle() {
        this(10.1);
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double square() {
        return Math.PI * Math.pow(radius, 2);
    }
}
