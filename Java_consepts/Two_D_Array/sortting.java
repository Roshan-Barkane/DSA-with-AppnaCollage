package Java_consepts.Two_D_Array;

class sortting {

    public static boolean sortting2d(int a[][], int k) {
        // define the stating point to search element from the matrix
        int row = 0;
        int col = a[0].length - 1;
        // true condition util find element other wise goto next statement
        while (row <= a.length - 1 && col >= 0) {
            // element are find then give index
            if (a[row][col] == k) {
                System.out.println("found key at (" + row + " , " + col + ")");
                return true;
            }
            // key is grater than current element
            else if (k > a[row][col]) {
                col--;
            }
            // key is less than current element
            else {
                row++;
            }
        }
        System.out.println("key is not found");
        return false;
    }

    public static void main(String args[]) {
        int a[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        int key = 37;
        sortting2d(a, key);
    }
}