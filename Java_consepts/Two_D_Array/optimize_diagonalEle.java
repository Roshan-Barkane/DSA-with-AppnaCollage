package Java_consepts.Two_D_Array;

public class optimize_diagonalEle {
    public static void sumOfDiagonal(int a[][]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][i];
            if (i != a.length - 1 - i)
                sum += a[i][a.length - 1 - i];
        }
        System.out.println(sum);
    }

    public static void main(String ags[]) {
        int a[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        sumOfDiagonal(a);
    }
}
