package Java_consepts.sorting;

public class counting_sortDec {
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }

    public static void countingSortDec(int a[]) {
        int largest = Integer.MIN_VALUE;
        // get largest element in array
        for (int i = 0; i < a.length; i++) {
            largest = Math.max(largest, a[i]);
        }
        // count the num how many time comes
        int count[] = new int[largest + 1];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        // sorting
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                a[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String ar[]) {
        int a[] = { 3, 6, 2, 1, 8, 7, 4, 5 };
        printArray(a);
        countingSortDec(a);
        printArray(a);

    }
}
