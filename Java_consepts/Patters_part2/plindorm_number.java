package Java_consepts.Patters_part2;

public class plindorm_number {
    public static void plindorm(int n) {
        int tem = 0;
        for (int i = 1; i <= n; i++) {
            tem = i;
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);

            }

            System.out.println();

        }
    }

    public static void main(String ar[]) {
        plindorm(4);
    }
}
