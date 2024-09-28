package Java_consepts.Array;

public class print_subarray {
    public static void subArray(int a[]) {
        int totalpair = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(a[k]);
                }
                totalpair++;
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(" TotalPair : " + totalpair);
    }

    public static void main(String args[]) {
        int a[] = { 2, 4, 6, 8, 10 };
        subArray(a);
    }
}
