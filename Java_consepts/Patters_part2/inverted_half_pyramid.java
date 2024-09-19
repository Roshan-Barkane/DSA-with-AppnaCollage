package Java_consepts.Patters_part2;

public class inverted_half_pyramid {
    public static void InvertedHalfPyramid(int n) {
        // for inner loop
        for (int i = 1; i <= n; i++) {
            // for print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for print star
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        InvertedHalfPyramid(4);
    }
}
