package Java_consepts.Array;

public class problem2 {
    public static int Problem2(int a[], int target) {
        for (int i = 0; i < a.length; i++) {
            if (target == a[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int a[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(Problem2(a, 6));
    }
}
