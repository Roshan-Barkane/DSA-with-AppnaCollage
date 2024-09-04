package Java_consepts.Patters_part1;

public class decrese_oder {
    public static void main(String args[]) {
        int k = 5;
        for (int line = 1; line <= 5; line++) {
            for (int star = 1; star <= k; star++) {
                System.out.print("*");
            }
            k--;
            System.out.println("");
        }

    }
}
