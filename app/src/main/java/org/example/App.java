package org.example;

public class App {
    public static void main(String[] args) {
        // Circle
        Circle circle = new Circle(2);
        System.out.println("Circle → Area: " + circle.getArea() + ", Perimeter: " + circle.getPerimeter());

        // Rectangle
        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println("Rectangle → Area: " + rectangle.getArea() + ", Perimeter: " + rectangle.getPerimeter());

        // Right Triangle
        RightTriangle triangle = new RightTriangle(3, 4);
        System.out.println("Right Triangle → Area: " + triangle.getArea() + ", Perimeter: " + triangle.getPerimeter());

        // Square
        Square square = new Square(5);
        System.out.println("Square → Area: " + square.getArea() + ", Perimeter: " + square.getPerimeter());

        // Isosceles Right Triangle
        IsoscelesRightTriangle isoTriangle = new IsoscelesRightTriangle(2);
        System.out.println("Isosceles Right Triangle → Area: " + isoTriangle.getArea() + ", Perimeter: " + isoTriangle.getPerimeter());

        // Polygon interface tests
        Polygon[] polygons = {
            new RectanglePolygon(4, 3),
            new SquarePolygon(5),
            new RightTrianglePolygon(3, 4),
            new IsoscelesRightTrianglePolygon(2)
        };

        for (Polygon p : polygons) {
            System.out.println(p.getClass().getSimpleName() + " → Number of sides: " + p.numberOfSides());
        }
    }
}
