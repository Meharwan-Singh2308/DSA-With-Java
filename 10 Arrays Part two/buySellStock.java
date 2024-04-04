public class buySellStock {

    public static int buySellStocks(int[] price) {
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyprice < price[i]) {
                int profit = price[i] - buyprice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyprice = price[i];
            }
        }

        return maxProfit;
    }

    public static void main(String args[]) {
        int[] price = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buySellStocks(price));
    }
}
