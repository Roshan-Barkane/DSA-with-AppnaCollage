package Java_consepts.Array;

public class max_sumoptimize {
    public static void maxSumOfPair(int a[]) {
        int Max = Integer.MIN_VALUE;
        int sum = 0;
        int prefix[] = new int[a.length];
        prefix[0] = a[0];
        // calculate the prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                sum = 0;
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
            }
            if (Max < sum) {
                Max = sum;
            }

        }
        System.out.print(Max);
    }

    public static void main(String aa[]) {
        int a[] = { 1, -2, 6, -1, 3 };
        maxSumOfPair(a);
    }
}
