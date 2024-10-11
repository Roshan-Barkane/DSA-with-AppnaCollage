package Java_consepts.Two_D_Array;

import java.util.Scanner;

public class largest_no {
    public static void largestElement(int a[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                }
                if (min > a[i][j]) {
                    min = a[i][j];
                }

            }
        }
        System.out.println(" largest no. is : " + max);
        System.out.println(" largest no. is : " + min);
    }

    public static void main(String arg[]) {
        int a[][] = new int[3][3];
        Scanner scan = new Scanner(System.in);
        // take input
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        largestElement(a);
    }
}
