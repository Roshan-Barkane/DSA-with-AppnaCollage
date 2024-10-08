package Java_consepts.sorting;

public class bubble_sortDec {
    public static void bubbleSortDec(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] <= a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                } else {
                    continue;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }

    public static void main(String args[]) {
        int a[] = { 12, 43, 23, 51, 19, 8 };
        bubbleSortDec(a);
    }
}
