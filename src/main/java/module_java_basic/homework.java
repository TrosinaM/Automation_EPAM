package module_java_basic;

import java.util.Arrays;

public class homework {
    public static void main(String[] args) {
        int[] array = new int[]{2, 6, 145, 3, -8, 51, 0, 1};
        int minValue = getMinValueFromArray(array);
        String value = new String("AbabA");
        checkPalindrom(value);
        sortArray(array);
        //   System.out.println("minValue: " + minValue);
        System.out.println("Palindrom: " + checkPalindrom(value));
        System.out.println(Arrays.toString(array));
    }

    //to get min value from array
    public static int getMinValueFromArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //To sort array from min value to max value
    public static void sortArray(int[] massive) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i] > massive[i + 1]) {
                    int tempValue = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = tempValue;
                    isSorted = false;
                }
            }
        }
    }

    //To check if a String is palindrome
    public static boolean checkPalindrom(String value) {
        for (int i = 0; i < value.length() / 2; i++) {
            if (value.charAt(i) != value.charAt(value.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}






