package Java_consepts.function_Methods;

public class SumAllDigit {
    public static void main(String args[]) {
        int n = 789;
        sumAllDigit(n);
    }

    // calculate the sum of all the digit of given number.
    public static void sumAllDigit(int num) {
        int remainder, addDigit = 0;
        int actualNum = num;
        while (num != 0) {
            remainder = num % 10;
            addDigit = addDigit + remainder;
            num /= 10;
        }
        System.out.println(actualNum + " all digit sum is : " + addDigit);
    }

}
