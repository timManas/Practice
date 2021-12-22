package Lists.MinDiffBetweenHighLowScore;

import java.util.Arrays;

public class MinDiffBetweenHighLowScore {
    public static void main(String [] args) {

        int [] nums2 = {87063,61094,44530,21297,95857,93551,9918};
        int k2 = 6;
        System.out.println("Min Diff: " + minimumDifference(nums2, k2) + "\n");

        int [] nums1 = {9,4,1,7};
        int k1 = 2;
        System.out.println("Min Diff: " + minimumDifference(nums1, k1) + "\n");

        int [] nums = {90};
        int k = 1;
        System.out.println("Min Diff: " + minimumDifference(nums, k) + "\n");




    }

    public static int minimumDifference(int[] nums, int k) {
        if (k == 1)
            return 0;

        // Sort Min Diff
        Arrays.sort(nums);
        for (int i=0; i < nums.length; i++)
            System.out.print(nums[i] +",");
        System.out.println();

        int min = Integer.MAX_VALUE;
        for (int i=0; i < nums.length - 1; i++) {
            int current = nums[i];
            int next = nums[i+1];
            min = min > Math.abs(next - current) ? Math.abs(next - current) : min;
            System.out.println("nums[i]:" + nums[i] + "     Min: " + min);
        }

        return min;
    }
}
