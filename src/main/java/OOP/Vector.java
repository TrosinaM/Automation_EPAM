package OOP;

import java.util.Random;

public class Vector {
    public double x;
    public double y;
    public double z;

    public Vector(double x, double z, double y) {
        this.x = x;
        this.z = z;
        this.y = y;
    }

    public double calcLengthVector() {
// (x, y, z)T |  =  √( x2 + y2 + z2)
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    //(scalar multiplication) – (x1*x2 +y1*y2 +z1*z2)
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double scalarMultiplication(Vector v1, Vector v) {
        return v1.getX() * v.getX() + v1.getY() * v.getY() + v1.getZ() * v.getZ();
    }

    //Static method that creates an array (or a list) of random vectors
    public static Vector[] getVector(int value) {
        Vector[] vector = new Vector[value];
        for (int i = 0; i < value; i++) {
            double x = new Random().nextDouble();
            double y = new Random().nextDouble();
            double z = new Random().nextDouble();
            vector[i] = new Vector(x, y, z);
        }
        return vector;

    }
}
