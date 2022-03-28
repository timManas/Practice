package Math.PerfectNumber;

public class PerfectNumber {
    public static void main(String [] args) {
        int [] input = {99999996, 120, 2, 28, 7};
        for (int i : input)
            System.out.println("Check Perfect number: " + checkPerfectNumber(i) + "\n");
    }


    // Its actually faster to start from the top all the way to the bottom
    public static boolean checkPerfectNumber(int num) {

        // Step1 - Keep track of the total
        int total = 0;

        // Step2 - Traverse from middle to 1
        for (int i=num/2; i > 0; i--) {
            int current = i;

            // Step3 - Check if the current number is divisible
            if (num % current == 0) {
                total += current;
                System.out.println("Current: " + current + "    total: " + total);
            }

            // Step4 - Check if the total does not go over the num
            if (total > num)
                return false;
        }

        return total == num;
    }
}
