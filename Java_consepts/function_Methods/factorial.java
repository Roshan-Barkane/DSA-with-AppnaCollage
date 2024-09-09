package Java_consepts.function_Methods;

import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a no. calculate of factorial : ");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println("Factorial of " + num + " is : " + fact);
    }

    // Factorial
    public static int factorial(int n) {
        int v = 1;
        for (int i = 1; i <= n; i++) {
            v = v * i;
        }
        return v;
    }
}
