package Java_consepts.sorting;

public class insertion_sort {
    public static void insertionSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int prev = i - 1;
            while (prev >= 0 && a[prev] > key) {
                a[prev + 1] = a[prev];
                prev--;
            }
            a[prev + 1] = key;
        }
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void main(String args[]) {
        int a[] = { 6, 4, 1, 2, 9, 8, 3, 5 };
        insertionSort(a);
        printArray(a);
    }
}
