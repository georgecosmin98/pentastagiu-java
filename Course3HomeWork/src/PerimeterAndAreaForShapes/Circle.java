package PerimeterAndAreaForShapes;

public class Circle {
    private float radius;
    private static double phi = 3.14;

    public Circle(float radius) {
        this.radius = radius;
    }

    void circlePerimeter() {
        System.out.println("Perimeter of circle is: " + 2 * phi * radius);
    }

    void circleArea() {
        System.out.println("Area of circle is: " + phi * radius * radius);
    }
}
