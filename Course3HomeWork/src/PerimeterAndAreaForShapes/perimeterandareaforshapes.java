package PerimeterAndAreaForShapes;

public class perimeterandareaforshapes {
    public static void main(String[] args) {
        //Square

        Square s = new Square(2);
        s.squareArea();
        s.squarePerimeter();

        //Rectangle

        Rectangle r = new Rectangle(2, 3);
        r.rectangleArea();
        r.rectanglePerimeter();

        //Triangle

        Triangle t = new Triangle(2, 3, 4);
        t.triangleArea();
        t.trianglePerimeter();

        //Circle

        Circle c = new Circle(4);
        c.circleArea();
        c.circlePerimeter();
    }
}
