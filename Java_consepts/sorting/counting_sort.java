package Java_consepts.sorting;

public class counting_sort {
    public static void countingSrot(int a[], int max) {
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
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                a[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void main(String arg[]) {
        int a[] = { 1, 4, 1, 3, 2, 4, 3, 7, 3 };
        countingSrot(a, 7);
        printArray(a);
    }
}
