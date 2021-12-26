package OOP;

public class Oval extends Round {
    public double r2;

    public Oval(double r2, double r1) {
        this.r2 = r2;
        radius = r1;
    }

    @Override
    public double getSquare() {
        double SquareRound = Math.PI * radius * r2;
        return SquareRound;
    }
}
