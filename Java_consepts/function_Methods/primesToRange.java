package Java_consepts.function_Methods;

public class primesToRange {

    // optimize code of No. is prime or not
    public static boolean checkPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // print the primes of range
    public static void primesRange(int n) {

        for (int i = 2; i <= n; i++) {
            if (checkPrime(i) == true) {
                System.out.print(i);
            }
        }
    }

    public static void main(String args[]) {
        primesRange(10);
    }
}
