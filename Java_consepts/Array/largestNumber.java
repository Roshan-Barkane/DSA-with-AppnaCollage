package Java_consepts.Array;

public class largestNumber {
    public static int getlargest(int num[]) {
        int large = Integer.MIN_VALUE;
        // int large = 0;
        for (int i = 0; i < num.length; i++) {
            if (large < num[i])
                large = num[i];
        }

        return large;
    }

    public static void main(String args[]) {
        int num[] = { 1, 3, 5, 7, 10, 12, 34, 16, 18 };
        int large = getlargest(num);
        System.out.println("largest no. is : " + large);
    }
}
