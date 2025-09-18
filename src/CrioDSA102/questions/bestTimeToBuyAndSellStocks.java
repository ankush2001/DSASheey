package CrioDSA102.questions;
/*
Sample Input 1
6

7 1 5 3 6 4

Sample Output 1
7

Explanation 1
Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.

Again buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.

Total profit of 7.


 */
public class bestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }

    private static int maxProfit(int[] prices) {

        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }
        return totalProfit;
    }
}
