package Math.GetMaxGenerated;

import java.util.Arrays;
import java.util.Collections;

public class GetMaxGenerated {
    public static void main(String [] args) {
        int [] input = {7,2,3,0};
        for (int i : input)
            System.out.println("max: " + getMaximumGenerated(i) + "\n");
    }

    public static int getMaximumGenerated(int n) {

        // Step1 - Check if n is small
        if (n <= 1) return n;


        int max = 1;
        int [] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;


        // Step2 - Travers from i till whenever this finishes
        int i = 1;
        while (i*2 <= n) {
            System.out.println("i: " + i);

            // Add to array only if within boundaries
            if (2*i <= n) {
                nums[2 * i] = nums[i];
                max = max < nums[2*i] ? nums[2*i] : max;
            }

            // Add to array only if within boundaries
            if (2*i + 1 <= n) {
                nums[2 * i + 1] = nums[i] + nums[i+1];
                max = max < nums[2*i + 1] ? nums[2*i + 1] : max;
            }

            i++;
        }
        System.out.println("Arr: " + Arrays.toString(nums));

        return max;
    }
}
