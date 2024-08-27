package Java_consepts.Variables_Datatype;

import java.util.*;

public class product_ab {
    public static void main(String args[]) {
        // take the two input fist and second number and calculate the product
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int product = first * second;
        System.out.println("Product of two no. : " + product);

        /*
         * We can data are stored one datatype to another datatype
         * 1. Type conversion
         * rules :
         * ¤ small data to big data
         * ¤ same value
         * eg :
         * byte -> short -> int -> float -> long -> double
         * 2. Type Costing (norrowing conversion , explicit conversion)
         * eg : int marks = (int) 99.99f
         */

        /*
         * Type promotion in Expression
         * 1 java automatically promotes each byte,shortm or char operand to int
         * when evaluating an expression
         * 2. if one operand is long, float or double the whole expression is promoted
         * to long, float, or double respectively.
         */
    }

}
