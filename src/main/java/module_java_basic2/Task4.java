package module_java_basic2;

public class Task4 {
    public static void main(String[] args) {
        NumberHolder holder = new NumberHolder();
        holder.anInt = 20;
        holder.aFloat = 2.3f;
        System.out.println("Display the value of each member variable " + (holder.getaFloat()));
        System.out.println("Display the value of each member variable " + (holder.getAnInt()));
    }
}
