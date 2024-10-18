package Java_consepts.Two_D_Array;

public class question3 {
    public static void que3(int a[][]) {
        int row = 2;
        int col = 3;
        int a2[][] = new int[col][row];
        // print the origin array of a
        printArray(a);
        // transpose the matrix a to a2
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a2[j][i] = a[i][j];
            }
        }
        System.out.println();
        // print the transpose matrix a2
        printArray(a2);

    }

    public static void printArray(int a[][]) {
        // print the old array element
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int a[][] = {
                { 11, 12, 13 }, { 21, 22, 23 }
        };
        que3(a);
    }
}
