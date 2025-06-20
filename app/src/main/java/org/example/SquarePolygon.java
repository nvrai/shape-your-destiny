package org.example;

public class SquarePolygon extends Square implements Polygon {
    public SquarePolygon(double side) {
        super(side);
    }

    @Override
    public int numberOfSides() {
        return 4;
    }
}

