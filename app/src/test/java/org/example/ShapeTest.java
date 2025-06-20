package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {
    @Test
    public void testCircle() {
        Circle c = new Circle(1);
        assertEquals(Math.PI, c.getArea(), 0.0001);
        assertEquals(2 * Math.PI, c.getPerimeter(), 0.0001);
    }

    @Test
    public void testRectangle() {
        Rectangle r = new Rectangle(2, 3);
        assertEquals(6, r.getArea(), 0.0001);
        assertEquals(10, r.getPerimeter(), 0.0001);
    }

    @Test
    public void testRightTriangle() {
        RightTriangle rt = new RightTriangle(3, 4);
        assertEquals(6, rt.getArea(), 0.0001);
        assertEquals(12, rt.getPerimeter(), 0.0001); // 3 + 4 + 5
    }

    @Test
    public void testSquare() {
        Square s = new Square(2);
        assertEquals(4, s.getArea(), 0.0001);
        assertEquals(8, s.getPerimeter(), 0.0001);
    }

    @Test
    public void testIsoscelesRightTriangle() {
        IsoscelesRightTriangle irt = new IsoscelesRightTriangle(1);
        double expectedPerimeter = 1 + 1 + Math.sqrt(2);
        assertEquals(0.5, irt.getArea(), 0.0001);
        assertEquals(expectedPerimeter, irt.getPerimeter(), 0.0001);
    }

    @Test
    public void testPolygonImplementations() {
        assertEquals(4, new RectanglePolygon(2, 3).numberOfSides());
        assertEquals(4, new SquarePolygon(3).numberOfSides());
        assertEquals(3, new RightTrianglePolygon(3, 4).numberOfSides());
        assertEquals(3, new IsoscelesRightTrianglePolygon(2).numberOfSides());
    }
}
