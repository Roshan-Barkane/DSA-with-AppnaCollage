package Java_consepts.function_Methods;

import java.util.Scanner;

public class palindroom {
    public static void main(String arf[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pidroom(n);
    }

    public static void pidroom(int num) {
        int reverseNum = 0, remainder;
        int originalNumber = num;
        while (num > 0) {
            remainder = num % 10;
            reverseNum = (reverseNum * 10) + remainder;
            num /= 10;
        }
        if (originalNumber == reverseNum) {
            System.out.println(originalNumber + " is Palindrome, ");
        } else {
            System.out.println(originalNumber + " is not Palindrome, ");
        }
    }
}
