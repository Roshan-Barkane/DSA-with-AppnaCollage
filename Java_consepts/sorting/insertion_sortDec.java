package Java_consepts.sorting;

public class insertion_sortDec {
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }

    public static void insertionSortDec(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] < key) {
                a[j + 1] = a[i];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String ar[]) {
        int a[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        printArray(a);
        insertionSortDec(a);
        printArray(a);

    }
}
