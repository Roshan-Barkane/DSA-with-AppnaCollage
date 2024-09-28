package Java_consepts.Array;

public class maxsum_pairs {
    public static void maxSum(int a[]) {
        int Max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += a[k];

                }
                if (Max < sum)
                    Max = sum;
            }
        }
        System.out.print(Max);
    }

    public static void main(String args[]) {
        int a[] = { 1, -2, 6, -1, 3 };
        maxSum(a);
    }
}
