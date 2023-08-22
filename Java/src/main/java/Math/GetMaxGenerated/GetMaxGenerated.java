package Math.GetMaxGenerated;

import java.util.Arrays;
import java.util.Collections;

public class GetMaxGenerated {
    public static void main(String [] args) {
        int [] input = {7,2,3};
        for (int i : input)
            System.out.println("max: " + getMaximumGenerated(i) + "\n");
    }

    public static int getMaximumGenerated(int n) {
        int max = 0;

        int [] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;

        int i = 2;

        while (i*2 <= n) {
            System.out.println("i: " + i);

            nums[2 * i] = nums[i];
            nums[2 * i + 1] = nums[i] + nums[i+1];

            i++;
        }
        System.out.println("Arr: " + Arrays.toString(nums));

        return max;
    }
}
