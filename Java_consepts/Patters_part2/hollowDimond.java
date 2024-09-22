package Java_consepts.Patters_part2;

public class hollowDimond {
    public static void dia(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        // 2rd half pattern
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (i == 1 || i == n || j == 1 || j == n + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }

    public static void main(String ar[]) {
        // not proper result
        dia(4);
    }
}
