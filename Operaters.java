class Operaters {
    public static void main(String args[]) {
        /*
         * All the operators in java
         * 1. Arithmetic operators
         * 2. Relationship operators
         * 3. Logical operators
         * 4. Bitwise operators
         * 5. Assignment operators
         * 
         */

        // Arithmetic operators
        int a = 10;
        int b = 5;
        /*
         * 
         * System.out.println("Add of two value " + (10 + 5));
         * System.out.println("sub of two value " + (10 - 5));
         * System.out.println("multi of two value " + (10 * 5));
         * System.out.println("div of two value " + (10 / 5));
         * System.out.println("modulo of two value " + (10 % 5));
         * System.out.println("before increase then print a " + (++a));
         * System.out.println("print the a then increase " + (a++));
         * System.out.println("before decrease then print b " + (--b));
         * System.out.println("print the b then decrease " + (b--));
         */

        // Relationship operators

        /*
         * System.out.println("a is less than b  " + (a < b));
         * System.out.println("a is grater than b " + (a > b));
         * System.out.println("a is greater than and equal to b " + (a <= b));
         * System.out.println("a is less than and equal to b " + (a >= b));
         * System.out.println("a is qual to b " + (a == b));
         * System.out.println("a in not qual to b " + (a != b));
         */

        // Logical Operators
        System.out.println(" Logical AND " + ((a < b) && (a != b)));
        System.out.println("Logical OR " + ((a > b) && (a != b)));
        System.out.println("Logical NOT " + !(a > b));

    }
}