package Java_consepts.Two_D_Array;

public class question2 {
    public static void que2(int a[][]) {
        int j = 0;
        int sum = 0;
        // go to loop m-1
        while (j < a.length) {
            // add the current array value
            sum += a[1][j];
            j++; // update the j
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        int a[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };
        que2(a);
    }
}
