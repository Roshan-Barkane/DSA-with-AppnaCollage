package Java_consepts.Array;

public class buy_sellStock {
    public static void buySell(int price[]) {
        // take he buy price
        int buy = price[0];
        int profit = 0;
        // calculate the profit
        for (int day = 1; day < price.length; day++) {
            int takeProfit = price[day] - buy;
            buy = Math.min(price[day], buy);
            profit = Math.max(takeProfit, profit);
        }
        System.out.println("Stack profit : " + profit);
    }
    // second code aapka collage

    public static void main(String arg[]) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        buySell(price);
    }
}
