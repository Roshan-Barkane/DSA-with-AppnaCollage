package Java_consepts.function_Methods;

public class overloading2 {
    // sum of two integer no.
    public static int sum(int a, int b) {
        return a + b;
    }

    // sum of two float no.
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String args[]) {

        // call the sum function
        System.out.println("Sum of two no. :" + sum(10, 20));
        System.out.println("Sum of two no. :" + sum(15.5f, 10.5f));

    }
}
