package Java_consepts.Two_D_Array;

public class quesition1 {
    // linear search to find how many time 7 are present 2d array
    public static void que1(int a[][], int key) {
        // if key are same then count are increase by 1
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                // if key is match of a[i][j] then increase count
                if (key == a[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]) {
        int a[][] = {
                { 4, 7, 8 }, { 8, 8, 7 }
        };
        que1(a, 7);
    }
}
