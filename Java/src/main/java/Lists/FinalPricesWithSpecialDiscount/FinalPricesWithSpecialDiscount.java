package Lists.FinalPricesWithSpecialDiscount;

public class FinalPricesWithSpecialDiscount {

    public static void main(String [] argsr) {
        int [][] input = {{8,4,6,2,3}, {1,2,3,4,5}, {10,1,1,6}};
        for (int [] prices : input) {
            int [] finalPrices = finalPrices(prices);
            for (int i : finalPrices)
                System.out.print(i + ",");
            System.out.println();
        }
    }

    public static int[] finalPrices(int[] prices) {

        // Step1 - Traverse Loop
        for (int i=0; i<prices.length; i++) {
            int current = prices[i];            // Keep track of current

            // Step2 - Traverse from i+1 onwards till end
            for (int j=i+1; j < prices.length; j++) {
                int next = prices[j];

                // Step3 - Verify if current >= next, modify price value in array.
                if (current >= next) {
                    prices[i] = current - next;
                    break;
                }
            }
        }
        return prices;
    }
}

/**
 Notes
 - Not too bad but crappy code
 - Run time O(n^2)

 Solution
 1. Traverse array i
 2. Traverse array from i+1 to end
 3. If current >= next value, then modify the value,
    > Else continue until we do
 4. Repeat until we reach end of array
 */
