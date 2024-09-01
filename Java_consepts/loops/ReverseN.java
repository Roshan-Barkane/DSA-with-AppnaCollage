package Java_consepts.loops;

import java.util.*;

public class ReverseN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // print the revers n no.
        for (int a = 1; a <= n; n--) {
            System.out.println("Revers is : " + n);
        }
    }
}
