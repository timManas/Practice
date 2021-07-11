package Math.CalculateMoneyInLeetCodeBank;

public class CalculateMoneyInLeetCodeBank {
    public static void main(String [] args) {
        int [] input = {4, 10, 20};
        for (int i : input)
            System.out.println("Total: " + totalMoney(i));
    }

    public static int totalMoney(int n) {
        int total = 0;      // Stores the total amount

        int startPoint = 0;     // Stores the adder
        int current = 1;        // Stores the current value (1,2,3,4,5,6,7)

        // Step1 - Traverse from 1 to n
        for (int i=1; i <= n; i++) {

            // Calculate the total
            total += (current + startPoint);
            current++;          // Increase the current by one ...

            // Step2 - If we pass the 7th digit, we reset the current back to 1 and increment the startingpoint
            if (i % 7 == 0) {
                current = 1;
                startPoint++;
            }
        }
        return total;
    }
}
