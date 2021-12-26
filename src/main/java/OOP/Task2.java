package OOP;

public class Task2 {
    public static void main(String[] args) {
        Shape shape = new Circle(6.5);
        Shape shape1 = new Oval(10.5, 5.5);
        Rectangular squareOfRectangleClass = new Square(45.5);
        Rectangular rectangle = new Rectangle(10.5, 9.5);
        double square = shape.getSquare();
        double square1 = shape1.getSquare();
        double square2 = squareOfRectangleClass.getSquare();
        double square3 = rectangle.getSquare();
        System.out.println("Square of Circle is " + square);
        System.out.println("Square of Oval is " + square1);
        System.out.println("Square of squareOfRectangle is " + square2);
        System.out.println("Square of Rectangle is " + square3);

    }
}
