package Java_consepts.conditional_statements;

import java.util.Scanner;

public class weather {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (value > 0)
            System.out.println(" value is grater than 0 ");
        else
            System.out.println(" value if less than 0 ");
    }
}
