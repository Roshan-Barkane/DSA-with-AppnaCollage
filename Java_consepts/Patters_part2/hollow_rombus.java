package Java_consepts.Patters_part2;

public class hollow_rombus {
    public static void holrombus(int n) {
        for (int i = 1; i <= n; i++) {
            // for print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for print star
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        holrombus(7);
    }
}
