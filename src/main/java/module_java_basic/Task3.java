package module_java_basic;

public class Task3 {

    /**
     * 3.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
     * (Create a separate method for each operation)
     */
    public static void main(String[] args) {
        int val1 = 125;
        int val2 = 24;
        System.out.println("SUM:"+sum(val1, val2));
        System.out.println("Muliply:"+multiply(val1, val2));
        System.out.println("Divide:"+divide(val1, val2));
        System.out.println("Subtract:"+subtract(val1, val2));
    }
    public static int sum(int val1, int val2) {
        return val1 + val2;
    }
    public static int multiply(int val1, int val2)
    {
        return val1 * val2;
    }
    public static int divide(int val1, int val2)
    {
        return val1/val2;
    }
    public static int subtract(int val1, int val2)
    {
        return val1-val2;
    }
}
