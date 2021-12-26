package OOP;

public class Circle extends Round {
    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double getSquare() {
        double SquareCircle = 2 * Math.PI * radius;
        return SquareCircle;
    }
}
