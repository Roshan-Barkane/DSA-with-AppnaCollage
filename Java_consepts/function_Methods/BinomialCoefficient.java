package Java_consepts.function_Methods;

import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate the Binomial Coefficient : ");
        System.out.println("Enter the n value : ");
        int n = sc.nextInt();
        System.out.println("Enter the r value : ");
        int r = sc.nextInt();
        int ncr = binomialCoeff(n, r);
        System.out.println("Binomial Coefficient is : " + ncr);
        sc.close();
    }

    // Factorial
    public static int factorial(int n) {
        int v = 1;
        for (int i = 1; i <= n; i++) {
            v = v * i;
        }
        return v;
    }

    // calculate the binomial coefficient
    public static int binomialCoeff(int n, int r) {
        int cn = factorial(n);
        int cr = factorial(r);
        int cnr = factorial(n - r);

        // for put the formula
        int bincof = cn / (cr * cnr);
        return bincof;
    }
}
