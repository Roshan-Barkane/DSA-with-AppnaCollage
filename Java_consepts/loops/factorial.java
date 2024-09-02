package Java_consepts.loops;

import java.util.Scanner;

public class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the NO.calculate the factorial of given No. :");
        int num = sc.nextInt();
        int fact = 1;
        while (1 <= num) {
            fact = fact * num;
            num--;
        }
        System.out.println(" Factorial is Given no is : " + fact);
    }
}
