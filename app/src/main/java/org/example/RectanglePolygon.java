package org.example;

public class RectanglePolygon extends Rectangle implements Polygon {
    public RectanglePolygon(double length, double width) {
        super(length, width);
    }
    public int numberOfSides() {
        return 4;
    }
}

