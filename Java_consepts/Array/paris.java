package Java_consepts.Array;

public class paris {
    public static void pairsArray(int a[]) {
        int pair = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                System.out.print("(" + a[i] + "," + a[j] + ")");
                pair++;
            }
            System.out.println();
        }
        System.out.println("Total pair : " + pair);

    }

    public static void main(String args[]) {
        int a[] = { 2, 4, 6, 8, 10 };
        pairsArray(a);
    }
}
