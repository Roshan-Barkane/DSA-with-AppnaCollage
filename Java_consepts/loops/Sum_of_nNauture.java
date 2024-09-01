package Java_consepts.loops;

import java.util.*;

public class Sum_of_nNauture {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int sum = 0;
        while (num <= n) {
            sum = sum + num;
            num++;
        }
        System.out.println("Sum of N Nature no : " + sum);

    }
}
