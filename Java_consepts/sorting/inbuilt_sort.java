package Java_consepts.sorting;

import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort {
    public static void printArray(Integer a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void main(String args[]) {
        Integer a[] = { 12, 43, 23, 51, 19, 8 };
        /*
         * import java.util.Arrays
         * 1.sort(arr);
         * 2.sort(arr,si,ei);
         */
        // Arrays.sort(a);
        // Arrays.sort(a, 0, 4);

        /*
         * import java.util.collection
         * 1.Arrays.sort(a, Collections.reverseOrder());
         * 2. Arrays.sort(a,si,ei, Collections.reverseOrder());
         */
        // Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(a, 0, 4, Collections.reverseOrder());
        printArray(a);

    }
}
