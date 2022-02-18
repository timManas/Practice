package Misc.ArrangingCoins;

public class ArrangingCoins {
    public static void main (String [] args) {
        int [] input = {2147483647,10,5,8};
        for (int i : input)
            System.out.println("Arrange Coins: " + arrangeCoins(i) + "\n");
    }

    public static int arrangeCoins(int n) {
        int rows = 0;           // For everytime total is greater than n, we increment rows
        int total = 0;          // Total amount using geometric series
        int current = 1;          // current is the number to add

        // Step2 - Traverse from 1 to
        while(total <= n) {
            total += current;
            System.out.println("index: " + current  + "   Total: " + total);

            ++current;
            ++rows;

            // If we  breach the int.max value, we stop the loop
            if (total < 0) {
                break;
            }
        }

        return total == n ? rows : rows - 1;
    }
}
