package Java_consepts.function_Methods;

public class decToBin {
    public static void main(String args[]) {
        DecToBin(11);
    }

    // for code print binary of decimal
    public static void DecToBin(int n) {
        int pow = 0;
        int bin = 0;
        int myNum = n;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary form of " + myNum + " = " + bin);
    }
}
