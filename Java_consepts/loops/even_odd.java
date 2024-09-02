package Java_consepts.loops;

import java.util.*;

public class even_odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sumOdd = 0;
        int sumEven = 0;
        int choise;
        int num;
        do {
            System.out.println("Enter the no. : ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            System.out.println("if are you enter more no.press 1 otherwise 0");
            choise = sc.nextInt();

        } while (choise == 1);

        System.out.println("Sum of all the even no. is :" + sumEven);
        System.out.println("Sum of all the even no. is :" + sumOdd);

    }
}
