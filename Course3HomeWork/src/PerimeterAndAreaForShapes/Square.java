package PerimeterAndAreaForShapes;

public class Square {
    private float side;

    public Square(float side) {
        this.side = side;
    }

    public void squarePerimeter() {
        System.out.println("Perimeter of square is: " + 4 * side);
    }

    public void squareArea() {
        System.out.println("Area of square is: " + side * side);
    }
}
