package Java_consepts.function_Methods;

import java.util.Scanner;

public class function_parameter {
    /*
     * syntax :- function with parameter
     * return_type function_name(type parameter1 , type parameter 2...){
     * ------------
     * ------------- body of the function
     * -------------
     * return statement;
     * }
     */
    public static void SumOfTwoNo(int a, int b) {
        System.out.print("Sun of Entered two no. : ");
        int c = a + b;
        System.out.print(c);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two no. : ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        // call the parameter Methods
        SumOfTwoNo(a, b);
    }
}
