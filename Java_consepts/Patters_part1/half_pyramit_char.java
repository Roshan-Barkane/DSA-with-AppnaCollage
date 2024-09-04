package Java_consepts.Patters_part1;

public class half_pyramit_char {
    public static void main(String args[]) {
        char ch = 'A';
        for (int line = 1; line <= 5; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
    }
}
