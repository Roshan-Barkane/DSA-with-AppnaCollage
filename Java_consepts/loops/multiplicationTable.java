package Java_consepts.loops;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any no. you want print multiplication table : ");
        int num = sc.nextInt();
        int mul = 0;
        int i = 1;
        System.out.println("Print the " + num + " Multiplication Table");
        while (i <= 10) {
            mul = i * num;
            System.out.println(i + "*" + num + "=" + mul);
            i++;
        }
    }
}
