package Java_consepts.Array;

public class reverse_element {
    public static void reverseElement(int a[]) {
        int end = a.length - 1, temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (i < end) {
                temp = a[i];
                a[i] = a[end];
                a[end] = temp;
                end = end - 1;
            }
        }
    }

    public static void main(String args[]) {
        int a[] = { 2, 4, 6, 8, 10, 12 };
        // print the value of after reverse
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        reverseElement(a);
        // print the value of after reverse
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
