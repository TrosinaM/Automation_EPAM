package OOP;

public class Task1 {
    public static void main(String[] args) {
        Vector v = new Vector(3, 4, 5);
        Vector v1 = new Vector(3, 4, 5);
        Vector.getVector(5);
        v.scalarMultiplication(v1,v);
        System.out.println("Result of scalar multiplication is " + v.scalarMultiplication(v1,v));
        System.out.println("Result of VectorLength is " + v.calcLengthVector());
    }
}
