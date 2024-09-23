package Java_consepts.Array;

import java.util.Scanner;

public class concept {
    public static void main(String args[]) {
        /*
         * Array - array is list of element of the some type placed in a contiguous
         * memory allocation
         * => Operation - create,input,output,update etc.
         */
        // create the array
        int num[] = new int[1023]; // type 1
        // String name[] = { "Roshan", "Lokesh", "Shubham", "Aanad", "Navin" }; // type
        // 2
        // int age[] = { 20, 13, 48, 39, 24, 22 };

        // input and output in arrays
        System.out.println("lenght of array is : " + num.length);
        Scanner scan = new Scanner(System.in);
        int marks[] = new int[3];
        // take the value of array elements
        System.out.println("Enter the three marks : ");
        for (int i = 0; i < 3; i++) {
            marks[i] = scan.nextInt();
        }
        // print the value of array elements
        System.out.println("Entered value is  : ");
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }

        // update the value of array element
        marks[0] = 20;
        marks[2] += 2;
        System.out.println("marks[0] is : " + marks[0]);
        System.out.println("marks[2] is : " + marks[2]);
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage of three marks :" + percentage + "%");
    }
}
