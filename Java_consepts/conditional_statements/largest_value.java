package Java_consepts.conditional_statements;

import java.util.*;

public class largest_value {
    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no. : ");
        a = sc.nextInt();
        System.out.println("Enter second no. : ");
        b = sc.nextInt();
        if (a > b) {
            System.out.println(" first is greater than second ");
        } else {
            System.out.println(" second is greater than first ");
        }
    }
}
