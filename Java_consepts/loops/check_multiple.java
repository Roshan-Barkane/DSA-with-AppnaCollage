package Java_consepts.loops;

import java.util.Scanner;

public class check_multiple {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do {
            System.out.println("Enter the any no. :");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                System.out.println("This no. is multiple of 10 : " + num);
                break;
            }
            System.out.println("value is : " + num);
            i++;
        } while (i < 100);
    }
}
