package PerimeterAndAreaForShapes;

public class Triangle {
    private float sideOne;
    private float sideTwo;
    private float sideThree;

    public Triangle(float sideOne, float sideTwo, float sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    void trianglePerimeter() {
        System.out.println("Perimeter of triangle is: " + (sideOne + sideTwo + sideThree));
    }

    void triangleArea() {
        float semiPerimeter = (sideOne + sideTwo + sideThree) / 2;
        System.out.println("Area of triangle is: " + (Math.sqrt(semiPerimeter * (semiPerimeter - sideOne) * (semiPerimeter - sideTwo) * (semiPerimeter - sideThree))));
    }
}
