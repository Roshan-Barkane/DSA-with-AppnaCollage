package Java_consepts.function_Methods;

import java.util.Scanner;

public class callByValue {
    public static void main(String args[]) {
        /*
         * two type of pass value in a function / method
         * 1. call by value --> create copy of actual value.
         * 2. call by reference --> change actual value .
         */

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter two no. : ");
        int a = scr.nextInt();
        int b = scr.nextInt();
        // for function is call by function
        CallByValue(a, b);
        System.out.println("Actual value is  a and b :" + a + " " + b);

    }

    public static void CallByValue(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println(" call by value of a and b : " + x + " " + y + " then");
    }

}
