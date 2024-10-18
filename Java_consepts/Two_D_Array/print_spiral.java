package Java_consepts.Two_D_Array;

public class print_spiral {
    public static void spiralMatrix(int a[][]) {
        int startrow = 0;
        int endrow = a.length - 1;
        int startcol = 0;
        int endcol = a[0].length - 1;
        // condition print boundary
        /*
         * i as a row
         * and j as a column
         */
        while (startrow <= endrow && startcol <= endcol) {
            // print top boundary
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(a[startrow][j] + " ");
            }
            // print right boundary
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(a[i][endcol] + " ");
            }
            // print bottom boundary
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(a[endrow][j] + " ");
            }
            // print left boundary
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(a[i][startcol] + " ");
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }

    public static void main(String arf[]) {
        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        spiralMatrix(a);
    }
}
