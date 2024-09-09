package Java_consepts.function_Methods;

import java.util.Scanner;

public class product {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("product of two no :" + product(x, y));
    }

    public static int product(int a, int b) {
        int pro = a * b;
        return pro;
    }
}
