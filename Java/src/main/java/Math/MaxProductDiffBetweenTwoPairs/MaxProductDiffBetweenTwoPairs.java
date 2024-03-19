package Math.MaxProductDiffBetweenTwoPairs;

import java.util.Arrays;

public class MaxProductDiffBetweenTwoPairs {
    public static void main (String [] args) {
        int [] nums = {5,6,2,7,4};
        System.out.println("Max Product Diff: " + maxProductDifference(nums));

        int [] nums1 = {4,2,5,9,7,4,8};
        System.out.println("Max Product Diff: " + maxProductDifference(nums1));
    }

    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1] * nums[nums.length-2]) - (nums[1] * nums[0]);
    }
}
