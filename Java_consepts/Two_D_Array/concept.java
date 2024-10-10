package Java_consepts.Two_D_Array;

import java.util.*;

class consept {

    public static void main(String arg[]) {
        int arr[][] = new int[3][3];
        int n = arr.length, m = arr[0].length;
        // take the value
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // print the values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}