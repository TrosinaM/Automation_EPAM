package module_java_basic2;

//1.	Write a Java program to concatenate a given string to the end of another string.
// And remove all `P` or `p` characters.
public class Task1 {

    public static void main(String[] args) {
        String s1 = "PHP Exercises and ";
        String s2 = "Python Exercises";
        String concatResult;
        concatResult = s1.concat(s2).replace("P", "");
        System.out.println("The concatenated string with replacements:  " + concatResult);
    }
}
