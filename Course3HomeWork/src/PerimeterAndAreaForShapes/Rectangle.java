package PerimeterAndAreaForShapes;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    void rectanglePerimeter() {
        System.out.println("Perimeter of rectangle is: " + (2 * length + 2 * width));
    }

    void rectangleArea() {
        System.out.println("Area of rectangle is: " + length * width);
    }
}
