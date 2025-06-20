package org.example;

public class IsoscelesRightTrianglePolygon extends IsoscelesRightTriangle implements Polygon {
    public IsoscelesRightTrianglePolygon(double leg) {
        super(leg);
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}
