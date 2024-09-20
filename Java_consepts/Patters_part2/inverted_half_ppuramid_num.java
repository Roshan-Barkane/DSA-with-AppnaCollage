package Java_consepts.Patters_part2;

public class inverted_half_ppuramid_num {
    // for first way to print inverter half pyramid with number
    public static void InvertedHalfPyramid1(int n) {
        // for inner loop
        for (int i = 0; i <= n - 1; i++) {
            // for print number
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }
            // for print space
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            System.out.println();
        }
    }

    // for second way to print inverter half pyramid with number
    public static void InvertedHalfPyramid(int n) {
        // for inner loop
        for (int i = 1; i <= n; i++) {
            // for print number
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        InvertedHalfPyramid(5);
    }
}
