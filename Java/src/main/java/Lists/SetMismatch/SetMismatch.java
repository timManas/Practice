package Lists.SetMismatch;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String [] args) {
        int [] nums = {1,2,2,4};
        System.out.println("Find Error nums: " + Arrays.toString(findErrorNums(nums)));

        int [] nums1 = {1,1};
        System.out.println("Find Error nums: " + Arrays.toString(findErrorNums(nums1)));
    }

    public static int[] findErrorNums(int[] nums) {
        int prev = nums[0];
        int [] output = new int [2];

        for (int i=1; i<nums.length; i++) {
            int current = nums[i];

            if (current == prev) {
                output[0] = current;
                output[1] = prev + 1;
                return output;
            }

            prev = current;
        }



        return output;
    }
}
