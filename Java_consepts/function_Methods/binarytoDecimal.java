package Java_consepts.function_Methods;

public class binarytoDecimal {
    public static void main(String args[]) {
        // call the function to take binary print decimal value.
        binToDec(1001);
    }

    public static void binToDec(int binNum) {
        int pow = 0;
        int dec = 0;
        int myNum = binNum;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            dec = dec + (int) (lastDigit * Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + myNum + " = " + dec);
    }

}
