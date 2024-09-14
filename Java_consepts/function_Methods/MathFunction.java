package Java_consepts.function_Methods;

public class MathFunction {
    public static void main(String args[]) {
        int a = 19, b = 34;
        // we can use all the math function provide in java
        System.out.println("Minimun value of " + a + " and " + b + " is : " + Math.min(a, b));
        System.out.println("Maximun value of " + a + " and " + b + " is : " + Math.max(a, b));
        System.out.println(
                "Squal value of " + a + " and " + b + " is : " + (int) Math.sqrt(a) + " " + (int) Math.sqrt(b));
        System.out.println("Power of 3 in " + a + " and " + b + " is : " + Math.pow(a, 3) + " " + Math.pow(b, 3));
    }
}
