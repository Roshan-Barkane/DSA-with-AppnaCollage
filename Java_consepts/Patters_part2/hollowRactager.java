package Java_consepts.Patters_part2;

public class hollowRactager {
    public static void main(String args[]) {
        hellowRec(4, 5);
    }

    // Hollow Rectangle patter
    public static void hellowRec(int row, int column) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || i == row || j == 1 || j == column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
