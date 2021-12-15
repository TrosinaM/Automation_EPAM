package module_java_basic2;

public class Task3 {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        Rectangle testRec = new Rectangle();
        myRect.wight = 40;
        myRect.height = 50;
        testRec.wight=300;
        testRec.height=10;
        testRec.color="black";
        System.out.println("myRect's area is " + myRect.area());
        System.out.println("myRect's area is " + testRec.area() + " and it is " + testRec.color);
    }

}
