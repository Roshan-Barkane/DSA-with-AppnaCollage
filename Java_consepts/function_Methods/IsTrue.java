package Java_consepts.function_Methods;

public class IsTrue {
    public static void main(String args[]) {
        isTrue(11);
    }

    public static void isTrue(int n) {
        if (n % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
