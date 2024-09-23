package Java_consepts.Patters_part2;

public class floyds_triangle {
    public static void floydsTriangle(int n) {
        // for outer loop
        int num = 1;
        for (int i = 1; i <= n; i++) {
            // for inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        floydsTriangle(5);
    }
}
