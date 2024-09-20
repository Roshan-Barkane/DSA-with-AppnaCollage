package Java_consepts.Patters_part2;

public class bytterfly_pattern {
    public static void bytterflyPatterm(int n) {
        // 1st half butterfly
        for (int i = 1; i <= n; i++) {
            // for inner loop for star- i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for inner loop for space - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }

            // for inner loop for star - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2st half butterfly
        for (int i = n; i >= 1; i--) {
            // for inner loop for star- i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // for inner loop for space - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }

            // for inner loop for star - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        bytterflyPatterm(5);
    }
}
