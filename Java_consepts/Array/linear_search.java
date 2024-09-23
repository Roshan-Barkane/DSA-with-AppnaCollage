package Java_consepts.Array;

public class linear_search {

    public static int linearSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String arf[]) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 17;
        int index = linearSearch(num, key);
        if (index == -1)
            System.out.println("not found");
        else
            System.out.println("index is a : " + index);
    }
}
