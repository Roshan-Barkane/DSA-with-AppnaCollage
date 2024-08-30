package Java_consepts.conditional_statements;

import java.util.*;
import java.util.Scanner;

public class old_even {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Enter the value is Even ");
        } else {
            System.out.println(" Enter the value is odd ");
        }
    }

}
