package module_java_basic;

public class Task4 {
    /**
     * 4.	Write a Java program to sum values of an array
     */
    public static void main(String[] args) {
        int[] myArray = new int[]{5, 6, 7, 12, -5, 32, 43};
        sum(myArray);
    }

    public static void sum(int[] myArray) {
        int y = 0;
        for (int i = 0; i < myArray.length; i++)
            y = y + myArray[i];

        System.out.println("Sum values of a myArray : " + y);
    }
}
