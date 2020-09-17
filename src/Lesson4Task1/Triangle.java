package Lesson4Task1;

import Lesson4Task1.Shape;

public class Triangle implements Shape {
    Double A;
    Double B;
    Double C;

    public Triangle(Double A, Double B, Double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public Triangle() {
        this(1.0, 2.0, 3.0);
    }

    @Override
    public Double square() {
        Double square = (A + B + C) / 2;
        return square;
    }
}
