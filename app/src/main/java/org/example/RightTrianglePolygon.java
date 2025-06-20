package org.example;

public class RightTrianglePolygon extends RightTriangle implements Polygon {
    public RightTrianglePolygon(double legA, double legB) {
        super(legA, legB);
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}
