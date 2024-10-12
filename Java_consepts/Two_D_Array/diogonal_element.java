package Java_consepts.Two_D_Array;

public class diogonal_element {
    public static void sumOfDingonal(int arr[][]) {
        int P_diagonal = 0;
        int S_diagonal = 0;
        int k = arr.length - 1;

        // inner loop 0 to n-1
        for (int i = 0; i < arr.length; i++) {
            // outer loop 0 to n-1
            for (int j = 0; j < arr[0].length; j++) {
                // main part
                if (i == j) {
                    P_diagonal += arr[i][j];
                    if (i == k || k % 2 == 1) {
                        k--;
                        continue;
                    } else {
                        S_diagonal += arr[i][k];
                        k--;
                    }
                }
            }
        }
        System.out.println("Pdiagonal is : " + P_diagonal);
        System.out.println("Sdiagonal is : " + S_diagonal);

    }

    public static void main(String ags[]) {
        int a[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int b[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        sumOfDingonal(a);

    }
}
