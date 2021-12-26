package OOP;

public class Rectangle extends Rectangular {
    public double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getSquare() {
        double Rectangle = sideA * sideB;
        return Rectangle;
    }
}
