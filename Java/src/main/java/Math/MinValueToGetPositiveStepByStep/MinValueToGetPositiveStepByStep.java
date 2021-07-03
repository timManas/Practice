package Math.MinValueToGetPositiveStepByStep;

public class MinValueToGetPositiveStepByStep {
    public static void main (String [] args) {
        int [][] input = {{-3,2,-3,4,2}, {1,2}, {1,-2,-3}};
        for (int[] nums : input) {
            System.out.println("Min Start Value: " + minStartValue(nums));
        }
    }

    public static int minStartValue(int[] nums) {
        int min = 1;

        // Step1 - Create Loop to go on foreverrrrr
        outerLoop:
        while (true) {

            // Step2 - Create pointer to follow the current Value
            int current = min;

            // Step3 - Create inner loop to constantly iterate through the input array
            for (int i=0; i < nums.length; i++) {
                int diff = current + nums[i];

                // Step4 - If the difference is less than 1, we exit the inner loop
                if (diff < 1)
                    break ;

                current = current + nums[i];
                System.out.println("Current: " + current);

                // Step5 - If last element and still BIGGER than 1 ... THIS IS THE MINIMUM
                if (i == nums.length - 1)
                    break outerLoop;
            }

           ++min;   // Increment
        }

        return min;
    }
}

/**
 Note
 - Not that difficult
 - Pain in but to debug

 Solution
 1. Create outerloop and inner loop
 2. Outerloop goes on forever and iterates the min value index
 4. We iterate the inner loop and figure out the difference is always more than 1.
    > If less, we break inner loop and increment min value by 1
 4. If the last element and ALL  diffs are greater than 1, then move break outer loop and return min value
 */
