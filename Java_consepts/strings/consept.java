package Java_consepts.strings;

import java.util.Scanner;

public class consept {
    // his function print the one by one latter in the given String
    public static void charTofString(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        /*
         * if you are stored the letter simply use character array but if you store as a
         * word sentence paragraph we can need to new structure called String
         * 
         * ---- char arr[] = {'a','b','c','d'};
         * ---- String str = "abcd"; --------------------- declare string
         * ---- String str2 = new Sting("abcde"); -------- declare string
         * Key-points : java has String is immutable means string does't change and any
         * type of data integer float special character store only double quotation
         * example---- "123 name @£$"
         */

        // String str = "abcd"; // declare String

        // take the input in the String
        // Scanner sc = new Scanner(System.in);
        // String name;

        // his function only get one word console and the variable in name
        // name = sc.next();

        // his function get all the string with space
        // name = sc.nextLine();

        // print the string value
        // System.out.println(name);

        // get the length of the string
        // System.out.println(name);
        // System.out.println(name.length());

        // Concatenation in the string
        /*
         * String firstName = "Roshan";
         * String secondName = "Barkane";
         * String fullName = firstName + " " + secondName;
         * System.out.println(fullName);
         */

        // find the character use to index with charAt(index)
        /*
         * String name = "Roshan";
         * System.out.println(name.charAt(0)); // print only R
         * charTofString(name); // print latter of given String
         */

    }
}
