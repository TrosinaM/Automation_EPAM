package module_java_basic;

public class Task5 {
    /*5.	Write a Java program to find the duplicate values of an array of integer values*/
    public static void main(String[] args) {
        int[] dupArray = new int[]{5, 6, 7, 12, -5, 32, 43, 6, 12};
        printArrayDuplicates(dupArray);
    }

    public static void printArrayDuplicates(int[] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (args[i] == args[j]) {
                    System.out.println("Output duplicate: " + args[i]);
                }
            }
        }

    }
}
