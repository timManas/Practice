package Lists.RichestCustomerWealth;

public class RichestCustomerWealth {
    public static void main(String [] args) {
        int [][] accounts = {{1,2,3},{3,2,1}};
        System.out.println("Richest Customer Wealth: " + maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;

        int currentWealth = 0;
        for (int row=0; row < accounts.length; row++) {
            for (int col=0; col < accounts[row].length; col++) {
                currentWealth += accounts[row][col];
            }
            max = currentWealth > max ? currentWealth : max;
            currentWealth = 0;
        }

        return max;
    }
}
