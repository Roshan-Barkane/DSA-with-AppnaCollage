package Java_consepts.Patters_part2;

public class inverted_half_ppuramid_num {
    public static void InvertedHalfPyramid(int n) {
        // for inner loop
        for (int i = 0; i <= n - 1; i++) {
            // for print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            // for print star
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        InvertedHalfPyramid(5);
    }
}
