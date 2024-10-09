package Java_consepts.sorting;

public class selection_sortDec {
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }

    public static void selectionSortDec(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minpos] < a[j]) {
                    minpos = j;
                }
                int tamp = a[minpos];
                a[minpos] = a[i];
                a[i] = tamp;
            }
        }
    }

    public static void main(String ar[]) {
        int a[] = { 3, 6, 2, 1, 8, 7, 4, 5 };
        printArray(a);
        selectionSortDec(a);
        printArray(a);

    }
}
