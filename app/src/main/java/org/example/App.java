package org.example;

public class App {
    public static void main(String[] args) {
        // Circle with radius 2
        Circle circle = new Circle(2);
        System.out.println("Circle:");
        System.out.printf("Area: %.2f%n", circle.getArea());
        System.out.printf("Perimeter: %.2f%n", circle.getPerimeter());

        // Rectangle with length 4 and width 3
        Rectangle rectangle = new Rectangle(4, 3);
        System.out.println("\nRectangle:");
        System.out.printf("Area: %.2f%n", rectangle.getArea());
        System.out.printf("Perimeter: %.2f%n", rectangle.getPerimeter());

        // Right Triangle with legs 3 and 4
        RightTriangle triangle = new RightTriangle(3, 4);
        System.out.println("\nRight Triangle:");
        System.out.printf("Area: %.2f%n", triangle.getArea());
        System.out.printf("Perimeter: %.2f%n", triangle.getPerimeter());
    }
}
