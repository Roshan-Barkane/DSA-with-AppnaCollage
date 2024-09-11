package Java_consepts.function_Methods;

/*Function Overloading is a special feature of java because java is allow to creating multiple function with same name but different parameters */
public class fun_Overloading {
    // sum of two no.
    public static int sum(int a, int b) {
        return a + b;
    }

    // sum of three no.
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {

        // call the sum function
        System.out.println("Sum of two no. :" + sum(10, 20));
        System.out.println("Sum of two no. :" + sum(15, 5, 10));

    }
}
