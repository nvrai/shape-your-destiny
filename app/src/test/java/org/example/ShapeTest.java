package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    public void testCircleAreaAndPerimeter() {
        Circle circle = new Circle(2);
        assertEquals(Math.PI * 4, circle.getArea(), 0.0001);
        assertEquals(2 * Math.PI * 2, circle.getPerimeter(), 0.0001);
    }

    @Test
    public void testRectangleAreaAndPerimeter() {
        Rectangle rectangle = new Rectangle(4, 3);
        assertEquals(12.0, rectangle.getArea(), 0.0001);
        assertEquals(14.0, rectangle.getPerimeter(), 0.0001);
    }

    @Test
    public void testRightTriangleAreaAndPerimeter() {
        RightTriangle triangle = new RightTriangle(3, 4);
        assertEquals(6.0, triangle.getArea(), 0.0001);
        assertEquals(3 + 4 + 5, triangle.getPerimeter(), 0.0001); // Hypotenuse is 5
    }


    @Test
    public void testSquareAreaAndPerimeter() {
        Square square = new Square(5);
        assertEquals(25.0, square.getArea(), 0.0001);
        assertEquals(20.0, square.getPerimeter(), 0.0001);
    }

    @Test
    public void testIsoscelesRightTriangleAreaAndPerimeter() {
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(2);
        double expectedHypotenuse = Math.sqrt(2 * 2 * 2);
        double expectedPerimeter = 2 + 2 + expectedHypotenuse;
        double expectedArea = 0.5 * 2 * 2;

        assertEquals(expectedArea, triangle.getArea(), 0.0001);
        assertEquals(expectedPerimeter, triangle.getPerimeter(), 0.0001);
    }
}
