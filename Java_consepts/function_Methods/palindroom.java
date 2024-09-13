package Java_consepts.function_Methods;

import java.util.Scanner;

public class palindroom {
    public static void main(String arf[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
         * if(pidroom(n);) {
         * System.out.println("Number : " + n + " is a palindrome");
         * } else {
         * System.out.println("Number : " + n + " is not a palindrome");
         * }
         */
        pidroom(n);
    }

    public static void pidroom(int n) {
        int palindrome = n; // copied number into variable
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (palindrome == reverse) {
            System.out.println(" Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
    }
}
