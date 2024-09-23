package Java_consepts.function_Methods;

// not optimize code
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

    public static void main(String args[]) {
        int a = 5;
        if (getPrime(a) == true) {
            System.out.println("value a is " + a + " prime");
        } else {
            System.out.println("value a is " + a + " not prime");
        }

        System.out.println("checkPrime : " + checkPrime(7));
    }
}
