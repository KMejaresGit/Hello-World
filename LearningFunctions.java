/**
 * Created by kimmejares on 08/06/2017.
 * Function Overloading
 */
public class LearningFunctions {

    public static int a = 30;
    public static int b = 40;

    public static void print() {

        System.out.println("Learning Functions");
    }

    public static void addNumbers() {

        int c = a + b;
        System.out.println("Addition sample : " + c);
    }

    public static void addNumbers2(int r, int s) {

        int add = r + s;
        System.out.println("Addition sample with passing arguments: " + add);
    }

    public static void main(String[]args) {

        print();
        addNumbers();
        addNumbers2(50,50);
    }
}
