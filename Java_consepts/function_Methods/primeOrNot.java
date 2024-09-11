package Java_consepts.function_Methods;

public class primeOrNot {
    public static boolean getPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (i % n == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String args[]) {
        int a = 5;
        if (getPrime(a) == true) {
            System.out.println("value a is " + a + " prime");
        } else {
            System.out.println("value a is " + a + " not prime");
        }
    }
}
