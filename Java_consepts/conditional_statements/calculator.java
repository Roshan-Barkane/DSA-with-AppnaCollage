package Java_consepts.conditional_statements;

import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two no : ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.println("Enter the symbol we do operations ");
        String symbol = sc.next();
        switch (symbol) {
            case "+":
                System.out.println("Addition of two no : " + (first + second));
                break;
            case "-":
                System.out.println("Subtraction of two no : " + (first - second));
                break;
            case "*":
                System.out.println("Multiply of two no : " + (first * second));
                break;
            case "/":
                System.out.println("Divisible of two no : " + (first / second));
                break;
            case "%":
                System.out.println("Modulo of two no : " + (first % second));
                break;
            default:
                System.out.println("you are wrong !");
        }

    }
}
