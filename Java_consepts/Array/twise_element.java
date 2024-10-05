package Java_consepts.Array;

public class twise_element {
    public static int twiseElement(int a[]) {

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count == 2) {
                return 1;
            }
        }
        return 0;

    }

    public static void main(String arg[]) {
        int a[] = { 1, 5, 3, 4, 10, 6, 7, 8, 9 };
        System.out.println(twiseElement(a));
    }
}
