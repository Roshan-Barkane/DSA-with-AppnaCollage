package Java_consepts.Array;

public class sumOfpairs {
    public static void sumOfPairs(int a[]) {
        int totalSum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int sum = a[i] + a[j];
                totalSum += sum;
                System.out.print("(" + a[i] + "," + a[j] + ")=" + sum + " ");
            }
            System.out.println();
        }
        System.out.println("sum of all pairs :" + totalSum);
    }

    public static void main(String srgs[]) {
        int a[] = { 2, 4, 6, 8, 10 };
        sumOfPairs(a);
    }
}
