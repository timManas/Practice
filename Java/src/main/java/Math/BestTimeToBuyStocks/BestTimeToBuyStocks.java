package Math.BestTimeToBuyStocks;

public class BestTimeToBuyStocks {

    public static void main(String [] args) {
        int [] input = {7,1,5,3,6,4};
//        int [] input = {7,3,5,100,1,2};
//        int [] input = {3,7,5,10,1,2};
        System.out.println("Maxiumum Profit: " + maxProfit(input));
    }


    public static int maxProfit(int[] prices) {

        // Step #1 - Make sure there are elements in the
        if (prices.length < 2)
            return 0;

        // TODO :: Find the buy and sell Index
        int buyIndex = 0;       // Buy has to be lower than Sell Index      BUY -> SELL
        int sellIndex = 0;      // Sell HAS to be higher than BUY Index
        int maxProfit = 0;
        int localProfit;
        int minPrice = prices[buyIndex];
        
        for (int i=1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            localProfit = prices[i] - Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, localProfit);
        }

        return maxProfit;
    }

}


/**

 Note:
 LocalProfit: BuyIndex - CurrentIndex
 NaxProfit: BuyIndex - SellIndex


 */
