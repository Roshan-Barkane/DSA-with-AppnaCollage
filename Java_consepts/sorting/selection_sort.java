package Java_consepts.sorting;

public class selection_sort {
    // array are sort decrease order
    public static void selectionSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minPos] > a[j]) {
                    minPos = j;
                }
            }
            int temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;
        }
    }

    // print the array element
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void main(String args[]) {
        int a[] = { 16, 4, 15, 1, 2, 13 };
        selectionSort(a);
        printArray(a);
    }
}
