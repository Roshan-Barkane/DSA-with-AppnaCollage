package Java_consepts.Patters_part2;

public class triangle_0_1 {
    public static void triangle01(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            // for inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                if (num == 1) {
                    num = 0;
                } else {
                    num = 1;
                }
            }
            System.out.println();
        }
    }

    // optimize code
    public static void zero_one_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");

            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        triangle01(5);
        zero_one_triangle(5);
    }
}
