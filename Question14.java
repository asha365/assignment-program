//14. Write a program to create a package named mypack and import it
//in circle class.
import mypack.MyMath;

public class Question14 {
    public static void main(String args[]) {
        double PI = 3.1416;
        double radius = 5;
        MyMath math = new MyMath();
        double area = PI * math.square(radius);

        System.out.println("Area of radius(" + radius + ") is :" + area);
    }
}