package Misc.ArrangingCoins;

public class ArrangingCoins {
    public static void main (String [] args) {
        int [] input = {5, 8};
        for (int i : input)
            System.out.println("Arrange Coins: " + arrangeCoins(i) + "\n");
    }

    public static int arrangeCoins(int n) {
        int rows = 0;

        int total = 0;
        int index = 1;
        while(total <= n) {
            total += index;
            ++index;
            ++rows;
            System.out.println("Total: " + total);
        }

        return total == n ? rows : rows - 1;
    }
}
