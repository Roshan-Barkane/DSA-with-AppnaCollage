package Java_consepts.conditional_statements;

import java.util.Scanner;

public class largest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give three no :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // calculate the tax
        if ((a >= b) && (a >= c))
            System.out.print(" first no. is largest");
        else if (b >= c)
            System.out.print(" second is largest");
        else if (c > b)
            System.out.print(" c is largest");

    }
}
