package Java_consepts.function_Methods;

public class average {
    public static void main(String args[]) {
        avg(10, 20, 30);
    }

    public static void avg(int first, int second, int third) {
        int avgs = (first + second + third) / 3;
        System.out.println("Average of three no. : " + first + " " + second + " " + third + " is " + avgs);
    }
}
