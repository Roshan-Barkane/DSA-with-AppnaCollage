package Java_consepts.sorting;

public class linear_search {
    public static void linearSearch(int a[], int item) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (item == a[i]) {
                count = 1;
            }
        }
        if (count == 1) {
            System.out.println(" item is present " + item);
        } else {
            System.out.println(" item is not present " + item);
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 4, 8, 7, 5, 9, 3, 2 };
        linearSearch(a, 9);

    }
}
