package Java_consepts.Array;

public class kadanes_Algorithm {
    public static void kadanesAlgorithm(int a[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            cs = cs + a[i];

            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("max  Sub array of :" + ms);
    }

    public static void main(String arf[]) {
        int a[] = { -2, -3, 4, -1, -2, -1, -5, -3 };
        kadanesAlgorithm(a);
    }

}
