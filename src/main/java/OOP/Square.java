package OOP;

public class Square extends Rectangular {

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double getSquare() {
        double Square = sideA* sideA;
        return Square;
    }
}
