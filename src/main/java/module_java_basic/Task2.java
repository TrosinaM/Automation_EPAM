package module_java_basic;

public class Task2 {

    public static void main(String[] args) {
//2.	Write a Java program to print the result of the following operations
        // a -5 + 8 * 6
        int value3=-5;
        int value4=8;
        int value5=6;
        int resultA=value3+value4*value5;
        System.out.println("A:"+resultA);

        //b (55+9) % 9
        int value6=55;
        int value7=9;
        int resultB=(value6+value7)%value7;
        System.out.println("B:"+resultB);

        //c 20 + -3*5 / 8
        int value8=20;
        int value9=-3;
        int value10=5;
        int resultC=value8+value9*value10/value4;
        System.out.println("C:"+resultC);

        //d 5 + 15 / 3 * 2 - 8 % 3
        int value11=15;
        int value12=3;
        int value13=2;
        int value14=8;
        int resultD=value10+value11/value12*value13-value14%value12;
        System.out.println("D:"+resultD);
    }
}
