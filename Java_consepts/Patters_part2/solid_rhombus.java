package Java_consepts.Patters_part2;

public class solid_rhombus {
    public static void solidRhombus(int n) {
        // for inner loop 1 to n
        for (int i = 1; i <= n; i++) {
            // for space print
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // for star print
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String arfs[]) {
        solidRhombus(5);

    }
}
