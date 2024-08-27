package Java_consepts.Variables_Datatype;

import java.util.*;

public class input {
    public static void main(String args[]) {
        /*
         * Inputs of java
         * we cen used the Scanner class objects and call the functions
         * Step1 : import the import java.util.*;
         * Step2 : create object Scanner input = new Scanner(System.in);
         * 
         * 
         * next ---------------:note - take the String without space
         * nextInt
         * nextFloat
         * nextDouble
         * nextLong
         * nextChar
         * nextLine -----------: note- take the String with space
         * nextBoolean
         * nextByte
         */
        Scanner input = new Scanner(System.in);
        String value = input.next();
        // print the value Entered values
        System.out.println("String is :a  " + value);
    }

}
